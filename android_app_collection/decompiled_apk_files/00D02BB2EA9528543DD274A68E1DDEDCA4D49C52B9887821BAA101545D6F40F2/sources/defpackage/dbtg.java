package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbtg  reason: default package */
/* loaded from: classes5.dex */
public final class dbtg implements dbtl {
    final /* synthetic */ String a;

    public dbtg(String str) {
        this.a = str;
    }

    @Override // defpackage.dbtl
    public final /* bridge */ /* synthetic */ Iterator a(dbtm dbtmVar, CharSequence charSequence) {
        return new dbtf(this, dbtmVar, charSequence);
    }
}
