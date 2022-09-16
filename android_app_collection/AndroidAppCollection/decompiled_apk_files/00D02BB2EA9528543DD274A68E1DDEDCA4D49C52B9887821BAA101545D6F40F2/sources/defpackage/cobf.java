package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cobf  reason: default package */
/* loaded from: classes.dex */
final class cobf implements cobo {
    @Override // defpackage.cobo
    public final cobn a(Context context, String str, cobm cobmVar) {
        cobn cobnVar = new cobn();
        int a = cobmVar.a(context, str, true);
        cobnVar.b = a;
        if (a != 0) {
            cobnVar.c = 1;
        } else {
            int b = cobmVar.b(context, str);
            cobnVar.a = b;
            if (b != 0) {
                cobnVar.c = -1;
            }
        }
        return cobnVar;
    }
}
