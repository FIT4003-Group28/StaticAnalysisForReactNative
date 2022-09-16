package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.auto.sdk.SearchItem;
import java.util.List;
/* compiled from: PG */
/* renamed from: cma  reason: default package */
/* loaded from: classes5.dex */
public final class cma extends cla implements IInterface {
    public cma(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.ISearchController");
    }

    public final void e() {
        Sk(1, a());
    }

    public final void f() {
        Sk(2, a());
    }

    public final void g(List<SearchItem> list) {
        Parcel a = a();
        a.writeTypedList(list);
        Sk(3, a);
    }

    public final void h(clz clzVar) {
        Parcel a = a();
        clc.f(a, clzVar);
        Sk(5, a);
    }

    public final void i() {
        Sk(6, a());
    }

    public final void j() {
        Parcel a = a();
        a.writeString("");
        Sk(7, a);
    }
}
