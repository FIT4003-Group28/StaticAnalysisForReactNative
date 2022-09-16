package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ampy  reason: default package */
/* loaded from: classes.dex */
public final class ampy implements amqe {
    final /* synthetic */ amoy a;

    public ampy(amoy amoyVar) {
        this.a = amoyVar;
    }

    @Override // defpackage.amqe
    public final /* bridge */ /* synthetic */ Iterator a(amqf amqfVar, CharSequence charSequence) {
        return new ampx(this, amqfVar, charSequence);
    }
}
