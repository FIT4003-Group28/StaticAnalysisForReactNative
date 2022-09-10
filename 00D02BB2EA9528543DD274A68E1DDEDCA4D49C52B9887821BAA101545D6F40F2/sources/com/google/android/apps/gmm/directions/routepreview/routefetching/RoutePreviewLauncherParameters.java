package com.google.android.apps.gmm.directions.routepreview.routefetching;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RoutePreviewLauncherParameters implements Parcelable {
    @dzsi
    public final vun a;
    public final boolean b;
    @dzsi
    public final amte c;
    public final int d;
    private static final dcqe e = dcqe.c("com.google.android.apps.gmm.directions.routepreview.routefetching.RoutePreviewLauncherParameters");
    public static final Parcelable.Creator<RoutePreviewLauncherParameters> CREATOR = new wbj();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
        if (r0.equals("START") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RoutePreviewLauncherParameters(android.os.Parcel r7) {
        /*
            r6 = this;
            r6.<init>()
            java.io.Serializable r0 = r7.readSerializable()
            java.io.Serializable r1 = r7.readSerializable()
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L5f
            if (r1 != 0) goto L12
            goto L5f
        L12:
            java.util.List r0 = (java.util.List) r0
            bvrt r1 = (defpackage.bvrt) r1
            java.util.Iterator r4 = r0.iterator()
        L1a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L30
            java.lang.Object r5 = r4.next()
            boolean r5 = r5 instanceof defpackage.amvh
            if (r5 != 0) goto L1a
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Unable to deserialize DirectionsParameters - Deserialized a waypoint which isn't an instance of Waypoint"
            defpackage.bvoo.h(r1, r0)
            goto L5f
        L30:
            dwao r4 = defpackage.dwao.R
            r5 = 7
            java.lang.Object r4 = r4.cu(r5)
            dssr r4 = (defpackage.dssr) r4
            dwao r5 = defpackage.dwao.R
            dssj r1 = r1.e(r4, r5)
            dwao r1 = (defpackage.dwao) r1
            dwao r4 = defpackage.dwao.R
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L51
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Unable to deserialize DirectionsParameters - Unable to decode options proto"
            defpackage.bvoo.h(r1, r0)
            goto L5f
        L51:
            vum r3 = new vum
            r3.<init>()
            r3.c(r0)
            r3.a = r1
            vun r3 = r3.a()
        L5f:
            r6.a = r3
            int r0 = r7.readInt()
            r1 = 1
            if (r0 == 0) goto L6a
            r0 = 1
            goto L6b
        L6a:
            r0 = 0
        L6b:
            r6.b = r0
            java.lang.String r0 = r7.readString()
            defpackage.dbsk.s(r0)
            int r3 = r0.hashCode()
            r4 = 3
            r5 = 2
            switch(r3) {
                case 2104194: goto L9b;
                case 79219778: goto L92;
                case 1775202868: goto L88;
                case 1929288288: goto L7e;
                default: goto L7d;
            }
        L7d:
            goto La5
        L7e:
            java.lang.String r2 = "WAIT_FOR_ROUTE_PREVIEW_LAUNCH"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La5
            r2 = 2
            goto La6
        L88:
            java.lang.String r2 = "WAIT_FOR_DIRECTIONS"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La5
            r2 = 1
            goto La6
        L92:
            java.lang.String r3 = "START"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto La5
            goto La6
        L9b:
            java.lang.String r2 = "DONE"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La5
            r2 = 3
            goto La6
        La5:
            r2 = -1
        La6:
            if (r2 == 0) goto Lb9
            if (r2 == r1) goto Lb8
            if (r2 == r5) goto Lb6
            if (r2 != r4) goto Lb0
            r1 = 4
            goto Lb9
        Lb0:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        Lb6:
            r1 = 3
            goto Lb9
        Lb8:
            r1 = 2
        Lb9:
            r6.d = r1
            java.io.Serializable r7 = r7.readSerializable()
            amte r7 = (defpackage.amte) r7
            r6.c = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.directions.routepreview.routefetching.RoutePreviewLauncherParameters.<init>(android.os.Parcel):void");
    }

    public RoutePreviewLauncherParameters(@dzsi vun vunVar, boolean z, int i, @dzsi amte amteVar) {
        this.a = vunVar;
        this.b = z;
        this.d = i;
        this.c = amteVar;
    }

    public final RoutePreviewLauncherParameters a() {
        int i = this.d;
        boolean z = true;
        if (i != 2 && i != 3) {
            z = false;
        }
        dbsk.l(z);
        return new RoutePreviewLauncherParameters(this.a, false, 4, this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bvrt bvrtVar;
        dcdc<amvh> dcdcVar;
        vun vunVar = this.a;
        if (vunVar != null) {
            dcdcVar = vunVar.l;
            bvrtVar = bvrt.b(vunVar.b);
        } else {
            bvrtVar = null;
            dcdcVar = null;
        }
        parcel.writeSerializable(dcdcVar);
        parcel.writeSerializable(bvrtVar);
        parcel.writeInt(this.b ? 1 : 0);
        int i2 = this.d;
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "DONE" : "WAIT_FOR_ROUTE_PREVIEW_LAUNCH" : "WAIT_FOR_DIRECTIONS" : "START";
        if (i2 != 0) {
            parcel.writeString(str);
            parcel.writeSerializable(this.c);
            return;
        }
        throw null;
    }
}
