package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbte  reason: default package */
/* loaded from: classes.dex */
public final class dbte implements dbtl {
    final /* synthetic */ dbrb a;

    public dbte(dbrb dbrbVar) {
        this.a = dbrbVar;
    }

    @Override // defpackage.dbtl
    public final /* bridge */ /* synthetic */ Iterator a(dbtm dbtmVar, CharSequence charSequence) {
        return new dbtd(this, dbtmVar, charSequence);
    }
}
