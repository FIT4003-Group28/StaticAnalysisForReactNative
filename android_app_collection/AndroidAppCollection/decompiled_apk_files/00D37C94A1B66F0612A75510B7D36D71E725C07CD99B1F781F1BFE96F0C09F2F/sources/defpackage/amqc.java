package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amqc  reason: default package */
/* loaded from: classes.dex */
public final class amqc implements amqe {
    final /* synthetic */ ampb a;

    public amqc(ampb ampbVar) {
        this.a = ampbVar;
    }

    @Override // defpackage.amqe
    public final /* bridge */ /* synthetic */ Iterator a(amqf amqfVar, CharSequence charSequence) {
        return new amqb(amqfVar, charSequence, this.a.a(charSequence));
    }
}
