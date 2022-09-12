package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: afdz  reason: default package */
/* loaded from: classes.dex */
public final class afdz extends afhx {
    public static final dbsl<afga> a = afdy.a;
    private final Context b;
    private final dxio<afha> c;

    public afdz(Intent intent, @dzsi String str, Context context, dxio<afha> dxioVar) {
        super(intent, str, afid.INCOGNITO);
        this.b = context;
        this.c = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        Intent intent = (Intent) this.f.getParcelableExtra("IncognitoIntent.intent_to_reprocess");
        if (intent != null) {
            this.c.a().f(this.b, intent, 2);
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_INCOGNITO;
    }
}
