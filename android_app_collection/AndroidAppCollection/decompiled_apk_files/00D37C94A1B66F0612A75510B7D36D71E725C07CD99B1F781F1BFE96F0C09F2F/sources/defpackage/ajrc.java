package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: ajrc  reason: default package */
/* loaded from: classes.dex */
public final class ajrc implements ajrt {
    public acti a;
    public acuv b;

    public ajrc() {
        this(null);
    }

    public ajrc(acti actiVar) {
        this.a = actiVar;
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        acti actiVar = this.a;
        if (actiVar != null) {
            ajrsVar.a(actiVar);
            Optional.ofNullable(this.b);
        }
    }
}
