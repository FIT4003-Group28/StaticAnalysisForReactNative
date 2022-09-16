package com.google.android.libraries.youtube.innertube.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;
import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class WatchNextResponseModel implements Parcelable, ajga {
    public static final Parcelable.Creator CREATOR = new xcg(20);
    public final asgt a;
    public final String b;
    public final apzg c;
    public final List d;
    public aakw e;
    public asgl f;
    public audg g;
    public aaks h;
    public aube i;
    private final Map j;
    private List k;
    private avzs l;
    private avzw m;
    private autk n;
    private Object o;

    /* JADX WARN: Removed duplicated region for block: B:107:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WatchNextResponseModel(defpackage.asgt r6) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel.<init>(asgt):void");
    }

    private final void e(auqh auqhVar) {
        loop0: for (auqk auqkVar : auqhVar.d) {
            aslq aslqVar = auqkVar.j;
            if (aslqVar == null) {
                aslqVar = aslq.a;
            }
            for (aslt asltVar : aslqVar.e) {
                if (this.l == null && (asltVar.c & 256) != 0) {
                    avzs avzsVar = asltVar.T;
                    if (avzsVar == null) {
                        avzsVar = avzs.a;
                    }
                    this.l = avzsVar;
                } else if (this.m == null && (asltVar.c & 512) != 0) {
                    avzw avzwVar = asltVar.U;
                    if (avzwVar == null) {
                        avzwVar = avzw.a;
                    }
                    this.m = avzwVar;
                } else if (this.n == null && (asltVar.d & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                    autk autkVar = asltVar.ad;
                    if (autkVar == null) {
                        autkVar = autk.a;
                    }
                    this.n = autkVar;
                }
                if (this.l != null && this.m != null && this.n != null) {
                    break loop0;
                }
            }
        }
        for (auqk auqkVar2 : auqhVar.d) {
            auuf auufVar = auqkVar2.v;
            if (auufVar == null) {
                auufVar = auuf.a;
            }
            auuh auuhVar = auufVar.r;
            if (auuhVar == null) {
                auuhVar = auuh.a;
            }
            arha arhaVar = auuhVar.e;
            if (arhaVar == null) {
                arhaVar = arha.a;
            }
            for (arhb arhbVar : arhaVar.c) {
                if ((arhbVar.b & 262144) != 0) {
                    arfe arfeVar = arhbVar.w;
                    if (arfeVar == null) {
                        arfeVar = arfe.a;
                    }
                    apzg apzgVar = arfeVar.m;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    awel awelVar = (awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint);
                    if ((awelVar.b & 16384) != 0) {
                        Map map = this.j;
                        String str = awelVar.c;
                        atub atubVar = awelVar.n;
                        if (atubVar == null) {
                            atubVar = atub.a;
                        }
                        map.put(str, atubVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.ajga
    public final auna a() {
        auna aunaVar = this.a.e;
        return aunaVar == null ? auna.a : aunaVar;
    }

    @Override // defpackage.ajga
    public final Object b() {
        return this.o;
    }

    @Override // defpackage.ajga
    public final void c(Object obj) {
        this.o = obj;
    }

    @Override // defpackage.ajga
    public final byte[] d() {
        return this.a.t.I();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zgd.K(this.a, parcel);
    }
}
