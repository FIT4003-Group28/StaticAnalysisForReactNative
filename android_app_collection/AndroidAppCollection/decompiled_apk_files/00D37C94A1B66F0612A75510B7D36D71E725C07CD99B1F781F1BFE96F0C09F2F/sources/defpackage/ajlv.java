package defpackage;

import com.youtube.android.libraries.elements.StatusOr;
/* compiled from: PG */
/* renamed from: ajlv  reason: default package */
/* loaded from: classes.dex */
public final class ajlv extends sth {
    private final aacz a;

    public ajlv(aacz aaczVar) {
        this.a = aaczVar;
    }

    @Override // defpackage.sth
    public final aooq a() {
        return arde.b;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFunctionBinding
    public final StatusOr execute(byte[] bArr) {
        aopa createBuilder = ardf.a.createBuilder();
        auol auolVar = this.a.b().D;
        if (auolVar == null) {
            auolVar = auol.a;
        }
        createBuilder.copyOnWrite();
        ardf ardfVar = (ardf) createBuilder.instance;
        auolVar.getClass();
        ardfVar.c = auolVar;
        ardfVar.b |= 1;
        return StatusOr.fromValue(((ardf) createBuilder.mo39build()).toByteArray());
    }
}
