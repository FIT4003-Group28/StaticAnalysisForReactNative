package defpackage;
/* compiled from: PG */
/* renamed from: wzx  reason: default package */
/* loaded from: classes4.dex */
public final class wzx {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public int e;
    public int f;

    public final synchronized void a(apak apakVar) {
        if (apakVar == null) {
            return;
        }
        this.a = apakVar.b;
        this.b = apakVar.c;
        int a = aoyt.a(apakVar.d);
        if (a == 0) {
            a = 1;
        }
        this.f = a;
        this.c = apakVar.e;
        this.d = apakVar.f;
        this.e = apakVar.g;
    }
}
