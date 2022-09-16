package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes.dex */
final class g implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0151b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0151b c0151b = new DynamiteModule.b.C0151b();
        c0151b.f7134a = aVar.a(context, str);
        c0151b.f7135b = c0151b.f7134a != 0 ? aVar.a(context, str, false) : aVar.a(context, str, true);
        if (c0151b.f7134a == 0 && c0151b.f7135b == 0) {
            c0151b.f7136c = 0;
        } else if (c0151b.f7135b >= c0151b.f7134a) {
            c0151b.f7136c = 1;
        } else {
            c0151b.f7136c = -1;
        }
        return c0151b;
    }
}
