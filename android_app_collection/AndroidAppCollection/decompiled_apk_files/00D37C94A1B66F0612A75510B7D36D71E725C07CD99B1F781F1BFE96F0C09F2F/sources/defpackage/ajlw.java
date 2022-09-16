package defpackage;

import com.youtube.android.libraries.elements.StatusOr;
/* compiled from: PG */
/* renamed from: ajlw  reason: default package */
/* loaded from: classes.dex */
public final class ajlw extends sth {
    private final aadd a;

    public ajlw(aadd aaddVar) {
        this.a = aaddVar;
    }

    @Override // defpackage.sth
    public final aooq a() {
        return ardg.b;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFunctionBinding
    public final StatusOr execute(byte[] bArr) {
        aopa createBuilder = ardh.a.createBuilder();
        auom auomVar = this.a.a().B;
        if (auomVar == null) {
            auomVar = auom.a;
        }
        createBuilder.copyOnWrite();
        ardh ardhVar = (ardh) createBuilder.instance;
        auomVar.getClass();
        ardhVar.c = auomVar;
        ardhVar.b |= 1;
        return StatusOr.fromValue(((ardh) createBuilder.mo39build()).toByteArray());
    }
}
