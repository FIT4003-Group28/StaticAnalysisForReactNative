package defpackage;
/* compiled from: PG */
/* renamed from: cnjd  reason: default package */
/* loaded from: classes5.dex */
public final class cnjd {
    public int a;

    public cnjd() {
    }

    public cnjd(cnje cnjeVar) {
        if (cnjeVar != null) {
            this.a = cnjeVar.a;
        }
    }

    public final cnje a() {
        return new cnje(this.a);
    }
}
