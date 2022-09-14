package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cobh  reason: default package */
/* loaded from: classes.dex */
final class cobh implements cobo {
    @Override // defpackage.cobo
    public final cobn a(Context context, String str, cobm cobmVar) {
        int a;
        cobn cobnVar = new cobn();
        int b = cobmVar.b(context, str);
        cobnVar.a = b;
        int i = 0;
        if (b != 0) {
            a = cobmVar.a(context, str, false);
            cobnVar.b = a;
        } else {
            a = cobmVar.a(context, str, true);
            cobnVar.b = a;
        }
        int i2 = cobnVar.a;
        if (i2 != 0) {
            i = i2;
        } else if (a == 0) {
            cobnVar.c = 0;
            return cobnVar;
        }
        if (i >= a) {
            cobnVar.c = -1;
        } else {
            cobnVar.c = 1;
        }
        return cobnVar;
    }
}
