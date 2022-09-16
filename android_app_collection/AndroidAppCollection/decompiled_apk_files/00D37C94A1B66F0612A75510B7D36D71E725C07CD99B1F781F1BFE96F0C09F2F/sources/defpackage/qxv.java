package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;
import com.google.android.gms.gass.internal.ProgramRequest;
import com.google.android.gms.gass.internal.ProgramResponse;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.herrevad.NetworkQualityReport;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: qxv  reason: default package */
/* loaded from: classes4.dex */
public final class qxv implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public qxv() {
    }

    public qxv(int i) {
        this.a = i;
    }

    public static final ErrorReport a(Parcel parcel) {
        int Q = tqj.Q(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        String str31 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        while (parcel.dataPosition() < Q) {
            int N = tqj.N(parcel);
            switch (tqj.M(N)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) tqj.U(parcel, N, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = tqj.Y(parcel, N);
                    break;
                case 4:
                    i = tqj.O(parcel, N);
                    break;
                case 5:
                    str2 = tqj.Y(parcel, N);
                    break;
                case 6:
                    str3 = tqj.Y(parcel, N);
                    break;
                case 7:
                    str4 = tqj.Y(parcel, N);
                    break;
                case 8:
                    str5 = tqj.Y(parcel, N);
                    break;
                case 9:
                    str6 = tqj.Y(parcel, N);
                    break;
                case 10:
                    str7 = tqj.Y(parcel, N);
                    break;
                case 11:
                    str8 = tqj.Y(parcel, N);
                    break;
                case 12:
                    i2 = tqj.O(parcel, N);
                    break;
                case 13:
                    str9 = tqj.Y(parcel, N);
                    break;
                case 14:
                    str10 = tqj.Y(parcel, N);
                    break;
                case 15:
                    str11 = tqj.Y(parcel, N);
                    break;
                case 16:
                    str12 = tqj.Y(parcel, N);
                    break;
                case 17:
                    str13 = tqj.Y(parcel, N);
                    break;
                case 18:
                    strArr = tqj.aj(parcel, N);
                    break;
                case 19:
                    strArr2 = tqj.aj(parcel, N);
                    break;
                case 20:
                    strArr3 = tqj.aj(parcel, N);
                    break;
                case 21:
                    str14 = tqj.Y(parcel, N);
                    break;
                case 22:
                    str15 = tqj.Y(parcel, N);
                    break;
                case 23:
                    bArr = tqj.af(parcel, N);
                    break;
                case 24:
                    i3 = tqj.O(parcel, N);
                    break;
                case 25:
                    i4 = tqj.O(parcel, N);
                    break;
                case 26:
                    i5 = tqj.O(parcel, N);
                    break;
                case 27:
                    i6 = tqj.O(parcel, N);
                    break;
                case 28:
                    str16 = tqj.Y(parcel, N);
                    break;
                case 29:
                    str17 = tqj.Y(parcel, N);
                    break;
                case 30:
                    str18 = tqj.Y(parcel, N);
                    break;
                case 31:
                    bundle = tqj.S(parcel, N);
                    break;
                case 32:
                    z = tqj.ae(parcel, N);
                    break;
                case 33:
                    i7 = tqj.O(parcel, N);
                    break;
                case 34:
                    i8 = tqj.O(parcel, N);
                    break;
                case 35:
                    z2 = tqj.ae(parcel, N);
                    break;
                case 36:
                    str19 = tqj.Y(parcel, N);
                    break;
                case 37:
                    str20 = tqj.Y(parcel, N);
                    break;
                case 38:
                    i9 = tqj.O(parcel, N);
                    break;
                case 39:
                    str21 = tqj.Y(parcel, N);
                    break;
                case 40:
                    str22 = tqj.Y(parcel, N);
                    break;
                case 41:
                    str23 = tqj.Y(parcel, N);
                    break;
                case 42:
                    str24 = tqj.Y(parcel, N);
                    break;
                case 43:
                    str25 = tqj.Y(parcel, N);
                    break;
                case 44:
                    str26 = tqj.Y(parcel, N);
                    break;
                case 45:
                    str27 = tqj.Y(parcel, N);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) tqj.U(parcel, N, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = tqj.Y(parcel, N);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) tqj.ai(parcel, N, FileTeleporter.CREATOR);
                    break;
                case 49:
                    strArr4 = tqj.aj(parcel, N);
                    break;
                case 50:
                    z3 = tqj.ae(parcel, N);
                    break;
                case 51:
                    str29 = tqj.Y(parcel, N);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) tqj.U(parcel, N, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) tqj.U(parcel, N, LogOptions.CREATOR);
                    break;
                case 54:
                    str30 = tqj.Y(parcel, N);
                    break;
                case 55:
                    z4 = tqj.ae(parcel, N);
                    break;
                case 56:
                    bundle2 = tqj.S(parcel, N);
                    break;
                case 57:
                    arrayList = tqj.ab(parcel, N, RectF.CREATOR);
                    break;
                case 58:
                    z5 = tqj.ae(parcel, N);
                    break;
                case 59:
                    bitmap = (Bitmap) tqj.U(parcel, N, Bitmap.CREATOR);
                    break;
                case 60:
                    str31 = tqj.Y(parcel, N);
                    break;
                case 61:
                    arrayList2 = tqj.aa(parcel, N);
                    break;
                case 62:
                    i10 = tqj.O(parcel, N);
                    break;
                default:
                    tqj.ad(parcel, N);
                    break;
            }
        }
        tqj.ac(parcel, Q);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, arrayList, z5, bitmap, str31, arrayList2, i10);
    }

    public static void b(InProductHelp inProductHelp, Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.E(parcel, 1, inProductHelp.a, i);
        tqj.F(parcel, 2, inProductHelp.b);
        tqj.F(parcel, 3, inProductHelp.c);
        tqj.s(parcel, 4, inProductHelp.d);
        tqj.F(parcel, 5, inProductHelp.e);
        tqj.s(parcel, 6, inProductHelp.f);
        tqj.n(parcel, m);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ResolveAccountRequest[i];
            case 1:
                return new MethodInvocation[i];
            case 2:
                return new ResolveAccountResponse[i];
            case 3:
                return new RootTelemetryConfiguration[i];
            case 4:
                return new TelemetryData[i];
            case 5:
                return new DroidGuardResultsRequest[i];
            case 6:
                return new DroidGuardInitReply[i];
            case 7:
                return new ErrorReport[i];
            case 8:
                return new FileTeleporter[i];
            case 9:
                return new LogOptions[i];
            case 10:
                return new ThemeSettings[i];
            case 11:
                return new GassRequestParcel[i];
            case 12:
                return new GassResponseParcel[i];
            case 13:
                return new ProgramRequest[i];
            case 14:
                return new ProgramResponse[i];
            case 15:
                return new GmsDeviceComplianceResponse[i];
            case 16:
                return new InProductHelp[i];
            case 17:
                return new OfflineSuggestion[i];
            case 18:
                return new OverflowMenuItem[i];
            case 19:
                return new TogglingData[i];
            default:
                return new NetworkQualityReport[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 513
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:60)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r27) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxv.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
