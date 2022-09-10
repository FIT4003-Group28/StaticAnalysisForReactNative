package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbti  reason: default package */
/* loaded from: classes5.dex */
public final class dbti implements dbtl {
    final /* synthetic */ dbre a;

    public dbti(dbre dbreVar) {
        this.a = dbreVar;
    }

    @Override // defpackage.dbtl
    public final /* bridge */ /* synthetic */ Iterator a(dbtm dbtmVar, CharSequence charSequence) {
        return new dbth(dbtmVar, charSequence, this.a.a(charSequence));
    }
}
