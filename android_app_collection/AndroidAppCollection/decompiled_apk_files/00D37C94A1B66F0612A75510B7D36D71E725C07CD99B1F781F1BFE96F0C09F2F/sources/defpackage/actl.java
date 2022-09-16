package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: actl  reason: default package */
/* loaded from: classes.dex */
public class actl {
    public acti a = acti.l;
    public byte[] b;
    public asjj c;

    public actl() {
        Optional.empty();
    }

    public final void a(acti actiVar) {
        if (actiVar != null) {
            this.a = actiVar;
            return;
        }
        zep.b("Trying to set a null InteractionLogger!!  Assigning to no-op InteractionLogger instead");
        this.a = acti.l;
    }
}
