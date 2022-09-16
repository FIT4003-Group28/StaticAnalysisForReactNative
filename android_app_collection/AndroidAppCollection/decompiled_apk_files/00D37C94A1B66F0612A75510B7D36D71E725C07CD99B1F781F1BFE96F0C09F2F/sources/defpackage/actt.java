package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: actt  reason: default package */
/* loaded from: classes.dex */
public class actt extends aaft {
    private final aafo a;
    private final String d;
    private final aopc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public actt(aafo aafoVar, apzg apzgVar, String str) {
        super(aafoVar, null, apzgVar, false);
        aopc aopcVar = null;
        this.a = aafoVar;
        this.e = apzgVar != null ? (aopc) apzgVar.mo52toBuilder() : aopcVar;
        this.d = str;
    }

    @Override // defpackage.aaft, android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.e != null) {
            if (this.d != null) {
                aopa createBuilder = atnp.a.createBuilder();
                String str = this.d;
                createBuilder.copyOnWrite();
                atnp atnpVar = (atnp) createBuilder.instance;
                str.getClass();
                atnpVar.b |= 1;
                atnpVar.c = str;
                this.e.e(atno.b, (atnp) createBuilder.mo39build());
            }
            this.a.c((apzg) this.e.mo39build(), null);
        }
    }
}
