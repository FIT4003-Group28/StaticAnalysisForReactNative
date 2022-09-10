package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: ztf  reason: default package */
/* loaded from: classes7.dex */
public class ztf {
    private final vtn a;
    @dzsi
    public Drawable b;
    @dzsi
    public vtl c;
    @dzsi
    private jhk d;

    public ztf() {
        vtm vtmVar = (vtm) btsr.a(vtm.class);
        dbsk.s(vtmVar);
        this.a = vtmVar.qa();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
    }

    public final void b(@dzsi jhk jhkVar) {
        if (dbsd.a(jhkVar, this.d)) {
            return;
        }
        this.d = jhkVar;
        if (jhkVar == null) {
            this.c = null;
            c(null);
            return;
        }
        this.c = new zte(this);
        c(this.a.b(jhkVar.a, jhkVar.b, this.c));
    }

    public final void c(@dzsi Drawable drawable) {
        this.b = drawable;
        a();
    }
}
