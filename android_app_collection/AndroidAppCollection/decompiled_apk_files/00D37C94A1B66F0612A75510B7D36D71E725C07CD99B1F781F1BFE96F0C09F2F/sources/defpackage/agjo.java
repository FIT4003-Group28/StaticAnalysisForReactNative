package defpackage;
/* compiled from: PG */
/* renamed from: agjo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agjo implements Runnable {
    public final /* synthetic */ agjz a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    private final /* synthetic */ int d;

    public /* synthetic */ agjo(agjz agjzVar, String str, long j) {
        this.a = agjzVar;
        this.b = str;
        this.c = j;
    }

    public /* synthetic */ agjo(agjz agjzVar, String str, long j, int i) {
        this.d = i;
        this.a = agjzVar;
        this.b = str;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            agjz agjzVar = this.a;
            String str = this.b;
            long j = this.c;
            if (!agjzVar.h.z()) {
                return;
            }
            ((aglj) agjzVar.k.get()).U(str, j);
            return;
        }
        agjz agjzVar2 = this.a;
        String str2 = this.b;
        long j2 = this.c;
        if (!agjzVar2.h.z()) {
            return;
        }
        ((aglj) agjzVar2.k.get()).T(str2, j2);
        str2.length();
        agjzVar2.h.v(new agoe(str2));
    }
}
