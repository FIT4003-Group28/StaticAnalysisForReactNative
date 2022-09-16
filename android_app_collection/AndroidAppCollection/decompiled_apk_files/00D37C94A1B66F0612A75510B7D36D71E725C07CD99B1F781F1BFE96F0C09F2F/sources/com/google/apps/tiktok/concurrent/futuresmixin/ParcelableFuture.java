package com.google.apps.tiktok.concurrent.futuresmixin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ParcelableFuture implements Parcelable {
    public final int a;
    public boolean b;
    public Object c;
    public Object d;
    public Throwable e;
    private amfp g;
    private static final amzy f = amzy.l("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture");
    public static final Parcelable.Creator CREATOR = new alwc(5);

    public ParcelableFuture(int i, Object obj, ankt anktVar) {
        this.b = false;
        this.a = i;
        this.c = obj;
        anlz.A(anktVar, ammo.e(new amfo(this)), anjk.a);
    }

    private static void c(Object obj, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        try {
            parcel.writeValue(obj);
        } catch (RuntimeException e) {
            parcel.setDataPosition(dataPosition);
            ((amzw) ((amzw) ((amzw) f.f()).h(e)).i("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "tryToWriteValue", (char) 186, "ParcelableFuture.java")).q("Result lost due to non-parcelable type.");
            String valueOf = String.valueOf(obj.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
            sb.append("Type not supported by Parcel and will be dropped: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public final void a() {
        amfp amfpVar = this.g;
        if (amfpVar != null) {
            final Throwable th = this.e;
            if (th != null) {
                final amfn amfnVar = (amfn) amfpVar;
                amfnVar.a.execute(ammo.f(new Runnable() { // from class: amfm
                    @Override // java.lang.Runnable
                    public final void run() {
                        amfn amfnVar2 = amfn.this;
                        ParcelableFuture parcelableFuture = this;
                        Throwable th2 = th;
                        if (!amfnVar2.d || !amfnVar2.c.remove(parcelableFuture)) {
                            return;
                        }
                        amfi amfiVar = (amfi) amfnVar2.b.a(parcelableFuture.a);
                        amlp m = amna.m("onFailure FuturesMixin", amls.a);
                        try {
                            amfiVar.a(parcelableFuture.c, th2);
                            m.close();
                        } catch (Throwable th3) {
                            try {
                                m.close();
                            } catch (Throwable unused) {
                            }
                            throw th3;
                        }
                    }
                }));
                return;
            }
            final Object obj = this.d;
            final amfn amfnVar2 = (amfn) amfpVar;
            amfnVar2.a.execute(ammo.f(new Runnable() { // from class: amfl
                @Override // java.lang.Runnable
                public final void run() {
                    amfn amfnVar3 = amfn.this;
                    ParcelableFuture parcelableFuture = this;
                    Object obj2 = obj;
                    if (!amfnVar3.d || !amfnVar3.c.remove(parcelableFuture)) {
                        return;
                    }
                    amfi amfiVar = (amfi) amfnVar3.b.a(parcelableFuture.a);
                    amlp m = amna.m("onSuccess FuturesMixin", amls.a);
                    try {
                        amfiVar.b(parcelableFuture.c, obj2);
                        m.close();
                    } catch (Throwable th2) {
                        try {
                            m.close();
                        } catch (Throwable unused) {
                        }
                        throw th2;
                    }
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(amfp amfpVar) {
        this.g = amfpVar;
        if (amfpVar == null || !this.b) {
            return;
        }
        a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        String str2;
        Object obj = this.c;
        String str3 = "";
        if (obj != null) {
            String name = obj.getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 7);
            sb.append("input=");
            sb.append(name);
            sb.append(";");
            str = sb.toString();
        } else {
            str = str3;
        }
        Object obj2 = this.d;
        if (obj2 != null) {
            String name2 = obj2.getClass().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 8);
            sb2.append("result=");
            sb2.append(name2);
            sb2.append(";");
            str2 = sb2.toString();
        } else {
            str2 = str3;
        }
        Throwable th = this.e;
        if (th != null) {
            String name3 = th.getClass().getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(name3).length() + 7);
            sb3.append("error=");
            sb3.append(name3);
            sb3.append(";");
            str3 = sb3.toString();
        }
        int length = String.valueOf(str).length();
        StringBuilder sb4 = new StringBuilder(length + 18 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb4.append("ParcelableFuture(");
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        try {
            c(this.c, parcel);
        } catch (RuntimeException e) {
            parcel.writeValue(null);
            this.b = true;
            this.e = new IllegalArgumentException("FuturesMixin input isn't Parcelable.", e);
            this.d = null;
        }
        parcel.writeInt(this.b ? 1 : 0);
        if (this.b) {
            try {
                c(this.d, parcel);
            } catch (RuntimeException e2) {
                parcel.writeValue(null);
                this.e = new IllegalArgumentException("FuturesMixin result isn't Parcelable.", e2);
            }
            try {
                c(this.e, parcel);
            } catch (RuntimeException e3) {
                String valueOf = String.valueOf(this.e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb.append("FuturesMixin result isn't Parcelable: ");
                sb.append(valueOf);
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString(), e3);
                this.e = illegalArgumentException;
                c(illegalArgumentException, parcel);
            }
        }
    }

    public ParcelableFuture(Parcel parcel) {
        boolean z = false;
        this.b = false;
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readInt();
        try {
            this.c = parcel.readValue(classLoader);
            z = parcel.readInt() == 1 ? true : z;
            this.b = z;
            if (z) {
                this.d = parcel.readValue(classLoader);
                this.e = (Throwable) parcel.readValue(classLoader);
            } else {
                this.b = true;
                this.e = new amfq();
                ((amzw) ((amzw) ((amzw) f.g()).h(this.e)).i("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "<init>", 78, "ParcelableFuture.java")).q("Result was lost due to parceling.");
            }
        } catch (RuntimeException e) {
            ((amzw) ((amzw) ((amzw) f.f()).h(e)).i("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "<init>", 81, "ParcelableFuture.java")).r("Failed to unparcel value for %d.", this.a);
            this.b = true;
            this.e = e;
        }
        a();
    }
}
