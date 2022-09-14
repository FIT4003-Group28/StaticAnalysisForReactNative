package defpackage;

import java.util.Currency;
/* compiled from: PG */
/* renamed from: dgwj  reason: default package */
/* loaded from: classes6.dex */
final class dgwj extends dgtl<Currency> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Currency a(dgxe dgxeVar) {
        return Currency.getInstance(dgxeVar.h());
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Currency currency) {
        dgxgVar.j(currency.getCurrencyCode());
    }
}
