package defpackage;
/* compiled from: PG */
/* renamed from: glm  reason: default package */
/* loaded from: classes.dex */
public final class glm implements Runnable {
    final /* synthetic */ cqhw a;

    public glm(cqhw cqhwVar) {
        this.a = cqhwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cqiw[] cqiwVarArr;
        for (cqiw cqiwVar : (cqiw[]) dclq.b(new cqiw[]{new isf(), new bivz(), new bffj(false), new gpl(), new grw(), new bgdg(false)}, new cqiw[]{new bxjh(), new atje(), new vjk(), new vfv(), new atib(), new uts(), new athe(), uxj.e(false, false)}, cqiw.class)) {
            if (String.valueOf(cqiwVar.getClass().getSimpleName()).length() == 0) {
                new String("Preallocate ");
            }
            this.a.f(cqiwVar);
        }
    }
}
