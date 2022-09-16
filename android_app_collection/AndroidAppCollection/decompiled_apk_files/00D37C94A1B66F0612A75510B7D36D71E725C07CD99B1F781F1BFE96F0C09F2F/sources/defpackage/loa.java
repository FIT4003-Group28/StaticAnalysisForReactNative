package defpackage;
/* compiled from: PG */
/* renamed from: loa  reason: default package */
/* loaded from: classes3.dex */
public class loa {
    public final ajru a;
    public final ajsm b;
    public final int c;

    public loa(ajru ajruVar, ajsm ajsmVar, int i) {
        this.a = ajruVar;
        this.b = ajsmVar;
        this.c = i;
    }

    public static lnt a(final yni yniVar) {
        return new lnt() { // from class: lnz
            @Override // defpackage.lnt
            public final void c(ajru ajruVar, ajsm ajsmVar, int i) {
                yni.this.d(new loa(ajruVar, ajsmVar, i));
            }
        };
    }
}
