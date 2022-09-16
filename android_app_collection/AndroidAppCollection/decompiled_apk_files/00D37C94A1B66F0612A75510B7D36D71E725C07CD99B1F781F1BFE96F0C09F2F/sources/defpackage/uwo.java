package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: uwo  reason: default package */
/* loaded from: classes4.dex */
public final class uwo implements uwn {
    private final Context a;

    public uwo(Context context) {
        this.a = context;
    }

    @Override // defpackage.uwn
    public /* bridge */ /* synthetic */ List a(int i, int i2, String str, long j) {
        return b(0, 0, str, j);
    }

    public amuk b(int i, int i2, String str, long j) {
        int i3;
        ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
        activityManager.getClass();
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(this.a.getPackageName(), 0, 0);
        amuf f = amuk.f();
        for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            if (!applicationExitInfo.getProcessName().equals(str) || applicationExitInfo.getTimestamp() != j) {
                aopa createBuilder = azyw.a.createBuilder();
                String processName = applicationExitInfo.getProcessName();
                createBuilder.copyOnWrite();
                azyw azywVar = (azyw) createBuilder.instance;
                processName.getClass();
                azywVar.b |= 1;
                azywVar.c = processName;
                int status = applicationExitInfo.getStatus();
                createBuilder.copyOnWrite();
                azyw azywVar2 = (azyw) createBuilder.instance;
                int i4 = 4;
                azywVar2.b |= 4;
                azywVar2.e = status;
                long timestamp = applicationExitInfo.getTimestamp();
                createBuilder.copyOnWrite();
                azyw azywVar3 = (azyw) createBuilder.instance;
                azywVar3.b |= 16;
                azywVar3.g = timestamp;
                long pss = applicationExitInfo.getPss();
                createBuilder.copyOnWrite();
                azyw azywVar4 = (azyw) createBuilder.instance;
                azywVar4.b |= 32;
                azywVar4.h = pss;
                long rss = applicationExitInfo.getRss();
                createBuilder.copyOnWrite();
                azyw azywVar5 = (azyw) createBuilder.instance;
                azywVar5.b |= 64;
                azywVar5.i = rss;
                boolean isLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
                createBuilder.copyOnWrite();
                azyw azywVar6 = (azyw) createBuilder.instance;
                azywVar6.b |= 128;
                azywVar6.j = isLowMemoryKillReportSupported;
                switch (applicationExitInfo.getReason()) {
                    case 0:
                        i3 = 15;
                        break;
                    case 1:
                        i3 = 2;
                        break;
                    case 2:
                        i3 = 3;
                        break;
                    case 3:
                        i3 = 4;
                        break;
                    case 4:
                        i3 = 5;
                        break;
                    case 5:
                        i3 = 6;
                        break;
                    case 6:
                        i3 = 7;
                        break;
                    case 7:
                        i3 = 8;
                        break;
                    case 8:
                        i3 = 9;
                        break;
                    case 9:
                        i3 = 10;
                        break;
                    case 10:
                        i3 = 11;
                        break;
                    case 11:
                        i3 = 12;
                        break;
                    case 12:
                        i3 = 13;
                        break;
                    case 13:
                        i3 = 14;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                if (i3 != 0) {
                    createBuilder.copyOnWrite();
                    azyw azywVar7 = (azyw) createBuilder.instance;
                    azywVar7.d = i3 - 1;
                    azywVar7.b |= 2;
                }
                int importance = applicationExitInfo.getImportance();
                if (importance == 100) {
                    i4 = 2;
                } else if (importance == 125) {
                    i4 = 3;
                } else if (importance == 200) {
                    i4 = 5;
                } else if (importance == 230) {
                    i4 = 6;
                } else if (importance == 300) {
                    i4 = 8;
                } else if (importance != 325) {
                    i4 = importance != 350 ? importance != 400 ? importance != 1000 ? 0 : 10 : 9 : 7;
                }
                if (i4 != 0) {
                    createBuilder.copyOnWrite();
                    azyw azywVar8 = (azyw) createBuilder.instance;
                    azywVar8.f = i4 - 1;
                    azywVar8.b |= 8;
                }
                f.h((azyw) createBuilder.mo39build());
            } else {
                return f.g();
            }
        }
        return f.g();
    }
}
