package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: dbeq  reason: default package */
/* loaded from: classes5.dex */
public final class dbeq implements dbis {
    @Override // defpackage.dbis
    public final dbeb a(View view) {
        dbjb.d(view, "Parameter \"view\" was null.");
        return new dbeb(dbiq.a(view.getWidth()) / 250.0f, dbiq.a(view.getHeight()) / 250.0f, 0.0f);
    }
}
