package defpackage;

import defpackage.dsqr;
import defpackage.dsqs;
/* compiled from: PG */
/* renamed from: dsqs  reason: default package */
/* loaded from: classes.dex */
public abstract class dsqs<MessageType extends dsqs<MessageType, BuilderType>, BuilderType extends dsqr<MessageType, BuilderType>> extends dsqw<MessageType, BuilderType> implements dsqt<MessageType, BuilderType> {
    public dsqh<dsqu> V = dsqh.d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dsqh<dsqu> e() {
        dsqh<dsqu> dsqhVar = this.V;
        if (dsqhVar.b) {
            this.V = dsqhVar.clone();
        }
        return this.V;
    }

    public final void f(dsqv<MessageType, ?> dsqvVar) {
        if (dsqvVar.a == ((dsqw) cu(6))) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    @Override // defpackage.dsqt
    public final <Type> boolean g(dspy<MessageType, Type> dspyVar) {
        throw null;
    }
}
