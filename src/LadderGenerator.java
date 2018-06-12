import java.util.ArrayList;
import java.util.List;

public class LadderGenerator {
    private static List<Ladder> ladders = null;

    /**
     * 根据给出的梯子的数量和梯子上的台阶的数量，生成参数要求的梯子
     *
     * @param ladderNumber 要求生成的梯子的数量 spec:大于0
     * @param pedalNumber  要求每个梯子上拥有的台阶的数量 spec:大于0
     */
    public static void generateLadders(int ladderNumber, int pedalNumber) {
        if (ladders != null) {
            ladders = new ArrayList<>();
            for (int i = 0; i < ladderNumber; i++)
                ladders.add(new Ladder(pedalNumber));
        }
    }

    /**
     * 返回生成的梯子对象列表
     * 返回一个新建的列表是为了防止外部改变梯子在列表中的顺序
     * 即外部改变梯子在列表中的顺序不会对此静态对象列表中的梯子对象的顺序产生影响
     *
     * @return
     */
    public static List<Ladder> getLadders() {
        return new ArrayList<>(ladders);
    }
}
