package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: uag  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uag implements ampg {
    private final /* synthetic */ int r;
    public static final /* synthetic */ uag q = new uag(20);
    public static final /* synthetic */ uag p = new uag(19);
    public static final /* synthetic */ uag o = new uag(18);
    public static final /* synthetic */ uag n = new uag(17);
    public static final /* synthetic */ uag m = new uag(16);
    public static final /* synthetic */ uag l = new uag(15);
    public static final /* synthetic */ uag k = new uag(14);
    public static final /* synthetic */ uag j = new uag(13);
    public static final /* synthetic */ uag i = new uag(12);
    public static final /* synthetic */ uag h = new uag(11);
    public static final /* synthetic */ uag g = new uag(10);
    public static final /* synthetic */ uag f = new uag(9);
    public static final /* synthetic */ uag e = new uag(8);
    public static final /* synthetic */ uag d = new uag(7);
    public static final /* synthetic */ uag c = new uag(6);
    public static final /* synthetic */ uag b = new uag(5);
    public static final /* synthetic */ uag a = new uag(1);

    public /* synthetic */ uag() {
    }

    public /* synthetic */ uag(int i2) {
        this.r = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        Bitmap bitmap = null;
        switch (this.r) {
            case 0:
                ampq ampqVar = (ampq) obj;
                ampqVar.h();
                return ampqVar;
            case 1:
                Exception exc = (Exception) obj;
                return amon.a;
            case 2:
                ampq ampqVar2 = (ampq) obj;
                ampqVar2.h();
                return ampqVar2;
            case 3:
                return (aogp) obj;
            case 4:
                return (InputStream) obj;
            case 5:
                aogp aogpVar = ((uav) obj).b;
                return aogpVar == null ? aogp.a : aogpVar;
            case 6:
                amuf f2 = amuk.f();
                for (uqc uqcVar : (amuk) obj) {
                    f2.h(uly.a.apply(uqcVar));
                }
                return f2.g();
            case 7:
                Log.e("OneGoogle", "Failed to load GoogleOwners.", (Exception) obj);
                return amuk.q();
            case 8:
                return ((uqe) obj).a();
            case 9:
                return ((uqe) obj).b();
            case 10:
                return ura.g(((uab) obj).a());
            case 11:
                return ((uab) obj).c();
            case 12:
                return ((ampq) obj).f();
            case 13:
                uad uadVar = (uad) obj;
                return null;
            case 14:
                InputStream inputStream = (InputStream) obj;
                if (inputStream != null) {
                    bitmap = BitmapFactory.decodeStream(inputStream);
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return bitmap;
            case 15:
                return ((uqe) obj).a();
            case 16:
                return ((uqe) obj).b();
            case 17:
                int i2 = urt.b;
                qwd c2 = ((rsb) obj).c();
                ArrayList arrayList = new ArrayList();
                Iterator it = c2.iterator();
                while (it.hasNext()) {
                    qwf qwfVar = (qwf) it.next();
                    if (!qwfVar.a.b()) {
                        arrayList.add(uru.a.apply(qwfVar));
                    }
                }
                return amuk.o(arrayList);
            case 18:
                int i3 = urt.b;
                ParcelFileDescriptor c3 = ((rsc) obj).c();
                if (c3 != null) {
                    try {
                        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(c3);
                        bitmap = BitmapFactory.decodeStream(autoCloseInputStream);
                        autoCloseInputStream.close();
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                return bitmap;
            case 19:
                return anuw.a((String) obj);
            default:
                return vdq.a((vbw) obj);
        }
    }
}
