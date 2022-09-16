package defpackage;
/* compiled from: PG */
/* renamed from: bknl  reason: default package */
/* loaded from: classes3.dex */
public class bknl implements bknk {
    private final String a;
    private final boolean b;
    private final ddho c = dtxv.ar;

    public bknl(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.bknk
    public String a() {
        return this.a;
    }

    @Override // defpackage.bknk
    public Boolean b() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.bknk
    public cjtd c() {
        return cjtd.a(this.c);
    }
}
