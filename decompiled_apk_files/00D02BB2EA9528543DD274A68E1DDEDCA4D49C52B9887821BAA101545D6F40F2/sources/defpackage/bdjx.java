package defpackage;
/* compiled from: PG */
/* renamed from: bdjx  reason: default package */
/* loaded from: classes3.dex */
public class bdjx implements bdju {
    private final int a;
    private final dwgq b;
    private boolean c = false;
    private final bdjt d;

    public bdjx(int i, dwgq dwgqVar, bdjt bdjtVar) {
        this.a = i;
        this.b = dwgqVar;
        this.d = bdjtVar;
    }

    @Override // defpackage.bdju
    public Integer a() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.bdju
    public dwgq b() {
        return this.b;
    }

    @Override // defpackage.bdju
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.bdju
    public void d(boolean z) {
        this.c = z;
    }

    @Override // defpackage.bdju
    public cqkl e() {
        this.d.a(this);
        return cqkl.a;
    }
}
