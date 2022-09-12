package defpackage;
/* compiled from: PG */
/* renamed from: boue  reason: default package */
/* loaded from: classes3.dex */
final class boue implements btzi<djhq, djhs> {
    final /* synthetic */ bouf a;

    public boue(bouf boufVar) {
        this.a = boufVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djhq> btzrVar, btzy btzyVar) {
        this.a.a.runOnUiThread(new Runnable(this) { // from class: boud
            private final boue a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bouf boufVar = this.a.a;
                boufVar.g.a(boufVar.d.c());
            }
        });
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djhq> btzrVar, djhs djhsVar) {
        final djhs djhsVar2 = djhsVar;
        this.a.a.runOnUiThread(new Runnable(this, djhsVar2) { // from class: bouc
            private final boue a;
            private final djhs b;

            {
                this.a = this;
                this.b = djhsVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                djgl c;
                boue boueVar = this.a;
                djhs djhsVar3 = this.b;
                if ((djhsVar3.a & 1) != 0) {
                    c = djhsVar3.b;
                    if (c == null) {
                        c = djgl.g;
                    }
                } else {
                    c = boueVar.a.d.c();
                }
                boueVar.a.g.a(c);
            }
        });
    }
}
