package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aglp  reason: default package */
/* loaded from: classes.dex */
public final class aglp {
    public aglp() {
    }

    public aglp(agli agliVar) {
        agliVar.getClass();
    }

    public static final agqd a(Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String string = cursor.getString(i);
        int i9 = cursor.getInt(i2);
        String string2 = cursor.getString(i3);
        int i10 = cursor.getInt(i4);
        int i11 = cursor.getInt(i5);
        byte[] blob = cursor.getBlob(i6);
        byte[] blob2 = cursor.getBlob(i7);
        boolean g = ymr.g(cursor, i8, true);
        agqc agqcVar = new agqc();
        agqcVar.a = string;
        agqcVar.b = i9;
        agqcVar.c = string2;
        agqcVar.d = i10;
        agqcVar.e = i11;
        agqcVar.f = blob;
        agqcVar.g = blob2;
        agqcVar.h = g;
        return agqcVar.a();
    }

    public static ankt b(ankt anktVar, final Callable callable, final Object obj, Executor executor) {
        return anhq.h(anii.i(anko.q(anktVar), new anir() { // from class: agir
            @Override // defpackage.anir
            public final ankt a(Object obj2) {
                Void r2 = (Void) obj2;
                return anlz.q(callable.call());
            }
        }, executor), agot.class, new ampg() { // from class: agiq
            @Override // defpackage.ampg
            public final Object apply(Object obj2) {
                agot agotVar = (agot) obj2;
                return obj;
            }
        }, anjk.a);
    }
}
