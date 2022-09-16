package com.facebook.litho;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import java.util.Deque;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LithoViewTestHelper {
    public static String a(dci dciVar) {
        if (dciVar == null) {
            return "";
        }
        String viewToString = viewToString(dciVar, true);
        if (!TextUtils.isEmpty(viewToString)) {
            return viewToString;
        }
        return "(" + dciVar.getLeft() + "," + dciVar.getTop() + "-" + dciVar.getRight() + "," + dciVar.getBottom() + ")";
    }

    private static void b(czt cztVar, StringBuilder sb, boolean z, int i) {
        for (czt cztVar2 : cztVar.m()) {
            int i2 = cztVar.p(cztVar2) ? -cztVar.a().left : 0;
            int i3 = cztVar.p(cztVar2) ? -cztVar.a().top : 0;
            sb.append("\n");
            for (int i4 = 0; i4 <= i; i4++) {
                sb.append("  ");
            }
            czu.addViewDescription(i2, i3, cztVar2, sb, z);
            b(cztVar2, sb, z, i + 1);
        }
    }

    public static TestItem findTestItem(dci dciVar, String str) {
        Deque findTestItems = dciVar.findTestItems(str);
        if (findTestItems.isEmpty()) {
            return null;
        }
        return (TestItem) findTestItems.getLast();
    }

    public static Deque findTestItems(dci dciVar, String str) {
        return dciVar.findTestItems(str);
    }

    public static String viewToString(dci dciVar) {
        return viewToString(dciVar, false);
    }

    public static String viewToString(dci dciVar, boolean z) {
        czt f = czt.f(dciVar);
        if (f == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 2;
        int[] iArr = new int[2];
        ViewParent parent = dciVar.getParent();
        int i2 = 0;
        if (!(parent instanceof View)) {
            iArr[0] = dciVar.getLeft();
            iArr[1] = dciVar.getTop();
        } else {
            dciVar.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            ((View) parent).getLocationOnScreen(iArr2);
            iArr[0] = iArr[0] - iArr2[0];
            iArr[1] = iArr[1] - iArr2[1];
        }
        czu.addViewDescription(iArr[0], iArr[1], f, sb, z);
        if (z) {
            for (ViewParent parent2 = dciVar.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                i++;
            }
            i2 = i;
        }
        b(f, sb, z, i2);
        return sb.toString();
    }
}
