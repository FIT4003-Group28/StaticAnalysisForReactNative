package defpackage;
/* compiled from: PG */
/* renamed from: atov  reason: default package */
/* loaded from: classes2.dex */
final class atov implements aopo {
    private final /* synthetic */ int i;
    static final aopo h = new atov(7);
    static final aopo g = new atov(6);
    static final aopo f = new atov(5);
    static final aopo e = new atov(4);
    static final aopo d = new atov(3);
    static final aopo c = new atov(2);
    static final aopo b = new atov(1);
    static final aopo a = new atov();

    private atov() {
    }

    private atov(int i) {
        this.i = i;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i) {
        switch (this.i) {
            case 0:
                if (akel.ax(i) != 0) {
                    return true;
                }
                break;
            case 1:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            case 2:
                return atpa.b(i) != null;
            case 3:
                return akel.aw(i) != 0;
            case 4:
                return atpx.b(i) != null;
            case 5:
                return akel.av(i) != 0;
            case 6:
                return akel.au(i) != 0;
            default:
                if (akel.at(i) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
