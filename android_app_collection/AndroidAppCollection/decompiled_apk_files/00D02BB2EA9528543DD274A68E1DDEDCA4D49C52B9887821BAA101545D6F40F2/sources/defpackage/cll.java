package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
/* compiled from: PG */
/* renamed from: cll  reason: default package */
/* loaded from: classes5.dex */
public final class cll extends ContextWrapper {
    final Context a;

    public cll(Context context, Context context2) {
        super(context);
        this.a = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        Context applicationContext = getBaseContext().getApplicationContext();
        if (applicationContext != null) {
            return new cll(applicationContext, this.a);
        }
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("window".equals(str)) {
            return this.a.getSystemService(str);
        }
        return super.getSystemService(str);
    }
}
