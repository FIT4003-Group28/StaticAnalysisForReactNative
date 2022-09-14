package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: dbeu  reason: default package */
/* loaded from: classes5.dex */
public final class dbeu implements dbis {
    @Override // defpackage.dbis
    public final dbeb a(View view) {
        dbjb.d(view, "Parameter \"view\" was null.");
        float width = view.getWidth();
        float height = view.getHeight();
        float f = (width == 0.0f || height == 0.0f) ? 0.0f : width / height;
        return f == 0.0f ? dbeb.l() : new dbeb(12.0f, 12.0f / f, 0.0f);
    }
}
