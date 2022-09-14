package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpme  reason: default package */
/* loaded from: classes.dex */
public final class cpme {
    public static ddbq a(Context context) {
        List<AccessibilityServiceInfo> arrayList;
        List<AccessibilityServiceInfo> arrayList2;
        ddbo bZ = ddbq.i.bZ();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        ContentResolver contentResolver = context.getContentResolver();
        try {
            arrayList = accessibilityManager.getInstalledAccessibilityServiceList();
        } catch (NullPointerException unused) {
            arrayList = new ArrayList<>();
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : arrayList) {
            if (accessibilityServiceInfo != null) {
                b(accessibilityServiceInfo.getId(), bZ, 3);
            }
        }
        try {
            arrayList2 = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        } catch (NullPointerException unused2) {
            arrayList2 = new ArrayList<>();
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo2 : arrayList2) {
            if (accessibilityServiceInfo2 != null) {
                b(accessibilityServiceInfo2.getId(), bZ, 2);
            }
        }
        boolean z = true;
        try {
            int c = c(Settings.System.getFloat(contentResolver, "font_scale") > 1.0f);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddbq ddbqVar = (ddbq) bZ.b;
            ddbqVar.f = c - 1;
            ddbqVar.a |= 16;
        } catch (Settings.SettingNotFoundException unused3) {
        }
        try {
            int c2 = c(Settings.Secure.getInt(contentResolver, "accessibility_display_magnification_enabled") == 1);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddbq ddbqVar2 = (ddbq) bZ.b;
            ddbqVar2.g = c2 - 1;
            ddbqVar2.a |= 32;
        } catch (Settings.SettingNotFoundException unused4) {
        }
        try {
            if (Settings.Secure.getInt(contentResolver, "high_text_contrast_enabled") != 1) {
                z = false;
            }
            int c3 = c(z);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddbq ddbqVar3 = (ddbq) bZ.b;
            ddbqVar3.h = c3 - 1;
            ddbqVar3.a |= 64;
        } catch (Settings.SettingNotFoundException unused5) {
        }
        return bZ.bK();
    }

    private static void b(String str, ddbo ddboVar, int i) {
        if (str.startsWith("com.google.") || str.startsWith("com.googlecode.")) {
            if (str.endsWith("TalkBackService")) {
                if (ddboVar.c) {
                    ddboVar.bF();
                    ddboVar.c = false;
                }
                ddbq ddbqVar = (ddbq) ddboVar.b;
                ddbq ddbqVar2 = ddbq.i;
                ddbqVar.b = i - 1;
                ddbqVar.a |= 1;
            } else if (str.endsWith("BrailleBackService")) {
                if (ddboVar.c) {
                    ddboVar.bF();
                    ddboVar.c = false;
                }
                ddbq ddbqVar3 = (ddbq) ddboVar.b;
                ddbq ddbqVar4 = ddbq.i;
                ddbqVar3.c = i - 1;
                ddbqVar3.a |= 2;
            } else if (str.endsWith("SwitchAccessService") || str.endsWith("SwitchControlService")) {
                if (ddboVar.c) {
                    ddboVar.bF();
                    ddboVar.c = false;
                }
                ddbq ddbqVar5 = (ddbq) ddboVar.b;
                ddbq ddbqVar6 = ddbq.i;
                ddbqVar5.d = i - 1;
                ddbqVar5.a |= 4;
            } else if (!str.endsWith("JustSpeakService") && !str.endsWith("VoiceAccessService")) {
            } else {
                if (ddboVar.c) {
                    ddboVar.bF();
                    ddboVar.c = false;
                }
                ddbq ddbqVar7 = (ddbq) ddboVar.b;
                ddbq ddbqVar8 = ddbq.i;
                ddbqVar7.e = i - 1;
                ddbqVar7.a |= 8;
            }
        }
    }

    private static int c(boolean z) {
        return z ? 2 : 3;
    }
}
