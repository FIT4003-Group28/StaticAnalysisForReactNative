package com.google.common.android.concurrent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.android.concurrent.ParcelableFuture;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ParcelableFuture implements Parcelable {
    public static final Parcelable.Creator<ParcelableFuture> CREATOR = new dbpv();
    public final int a;
    public final Object b;
    public dehn<?> c;
    private dbpw d;

    public ParcelableFuture(int i, dehn<?> dehnVar) {
        this.a = i;
        this.b = null;
        this.c = dehnVar;
    }

    public ParcelableFuture(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readInt();
        this.b = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            this.c = deha.b(new dbpx("ParcelableFuture was Parceled before the Future completed."));
        } else if (readInt == 1) {
            this.c = deha.a(parcel.readValue(classLoader));
        } else if (readInt == 2) {
            this.c = deha.b((Throwable) parcel.readValue(classLoader));
        } else {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown result type: ");
            sb.append(readInt);
            throw new IllegalArgumentException(sb.toString());
        }
        c();
    }

    public final boolean a() {
        return this.c.isDone();
    }

    public final void b(dbpw dbpwVar) {
        this.d = dbpwVar;
        c();
    }

    public final void c() {
        dbpw dbpwVar = this.d;
        if (dbpwVar == null || !a()) {
            return;
        }
        try {
            final Object r = deha.r(this.c);
            final dbpt dbptVar = (dbpt) dbpwVar;
            ((dbpt) dbpwVar).f(this, new Runnable(dbptVar, this, r) { // from class: dbpl
                private final dbpt a;
                private final ParcelableFuture b;
                private final Object c;

                {
                    this.a = dbptVar;
                    this.b = this;
                    this.c = r;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dbpt dbptVar2 = this.a;
                    final ParcelableFuture parcelableFuture = this.b;
                    final Object obj = this.c;
                    final dbpg<?, ?> b = dbptVar2.a.b(parcelableFuture.a);
                    dbptVar2.h(new Runnable(b, parcelableFuture, obj) { // from class: dbpp
                        private final dbpg a;
                        private final ParcelableFuture b;
                        private final Object c;

                        {
                            this.a = b;
                            this.b = parcelableFuture;
                            this.c = obj;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            dbpg dbpgVar = this.a;
                            ParcelableFuture parcelableFuture2 = this.b;
                            dbpgVar.a(parcelableFuture2.b, this.c);
                        }
                    });
                }
            });
        } catch (Error e) {
            e = e;
            dbpwVar.d(this, e);
        } catch (RuntimeException e2) {
            e = e2;
            dbpwVar.d(this, e);
        } catch (ExecutionException e3) {
            dbpwVar.d(this, e3.getCause());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        Object obj = this.b;
        if (obj != null) {
            String name = obj.getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 7);
            sb.append("input=");
            sb.append(name);
            sb.append(";");
            str = sb.toString();
        } else {
            str = "";
        }
        String valueOf = String.valueOf(this.c);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(valueOf).length());
        sb2.append("ParcelableFuture(");
        sb2.append(str);
        sb2.append("future=");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r9, int r10) {
        /*
            r8 = this;
            int r10 = r8.a
            r9.writeInt(r10)
            boolean r10 = r8.a()
            r0 = 1
            r1 = 2
            r2 = 0
            if (r10 == 0) goto L25
            dehn<?> r10 = r8.c     // Catch: java.lang.Error -> L18 java.lang.RuntimeException -> L1a java.util.concurrent.ExecutionException -> L1c
            java.lang.Object r10 = defpackage.deha.r(r10)     // Catch: java.lang.Error -> L18 java.lang.RuntimeException -> L1a java.util.concurrent.ExecutionException -> L1c
            r3 = r10
            r4 = r2
            r10 = 1
            goto L28
        L18:
            r10 = move-exception
            goto L21
        L1a:
            r10 = move-exception
            goto L21
        L1c:
            r10 = move-exception
            java.lang.Throwable r10 = r10.getCause()
        L21:
            r4 = r10
            r3 = r2
            r10 = 2
            goto L28
        L25:
            r10 = 0
            r3 = r2
            r4 = r3
        L28:
            int r5 = r9.dataPosition()
            java.lang.Object r6 = r8.b     // Catch: java.lang.RuntimeException -> L33
            r9.writeValue(r6)     // Catch: java.lang.RuntimeException -> L33
            r2 = r3
            goto L7a
        L33:
            r10 = move-exception
            r9.setDataPosition(r5)
            r9.writeValue(r2)
            dbpx r4 = new dbpx
            java.lang.Object r3 = r8.b
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r10 = r10.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r10)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 49
            int r5 = r5 + r6
            r7.<init>(r5)
            java.lang.String r5 = "Parceling failed for type and will be dropped: "
            r7.append(r5)
            r7.append(r3)
            java.lang.String r3 = "; "
            r7.append(r3)
            r7.append(r10)
            java.lang.String r10 = r7.toString()
            r4.<init>(r10)
            r10 = 2
        L7a:
            int r3 = r9.dataPosition()
            r9.writeInt(r10)     // Catch: java.lang.RuntimeException -> L8d
            if (r10 == 0) goto L8c
            if (r10 == r0) goto L89
            r9.writeValue(r4)     // Catch: java.lang.RuntimeException -> L8d
            return
        L89:
            r9.writeValue(r2)     // Catch: java.lang.RuntimeException -> L8d
        L8c:
            return
        L8d:
            r10 = move-exception
            r9.setDataPosition(r3)
            dbpx r0 = new dbpx
            java.lang.String r10 = r10.getMessage()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r2 = "Parceling failed for result and will be dropped: "
            int r3 = r10.length()
            if (r3 == 0) goto La8
            java.lang.String r10 = r2.concat(r10)
            goto Lad
        La8:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r2)
        Lad:
            r0.<init>(r10)
            r9.writeInt(r1)
            r9.writeValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.android.concurrent.ParcelableFuture.writeToParcel(android.os.Parcel, int):void");
    }
}
