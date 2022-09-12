package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cobi  reason: default package */
/* loaded from: classes5.dex */
final class cobi implements cobo {
    @Override // defpackage.cobo
    public final cobn a(Context context, String str, cobm cobmVar) {
        cobn cobnVar = new cobn();
        cobnVar.a = cobmVar.b(context, str);
        int a = cobmVar.a(context, str, true);
        cobnVar.b = a;
        int i = cobnVar.a;
        if (i == 0) {
            if (a == 0) {
                cobnVar.c = 0;
                return cobnVar;
            }
            i = 0;
        }
        if (a >= i) {
            cobnVar.c = 1;
        } else {
            cobnVar.c = -1;
        }
        return cobnVar;
    }
}
