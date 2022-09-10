package defpackage;

import android.provider.Settings;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.InputMethodInfo;
import android.widget.EditText;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bxeo  reason: default package */
/* loaded from: classes4.dex */
public final class bxeo<T> extends btrh<T> {
    private final int d;

    public bxeo(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        String sb;
        if (this.d != 0) {
            bxem bxemVar = (bxem) this.a;
            bxeu bxeuVar = (bxeu) obj;
            if (bxeuVar.a.isEmpty()) {
                return;
            }
            bxnt bxntVar = bxemVar.f;
            String string = Settings.Secure.getString(bxntVar.a.getContentResolver(), "default_input_method");
            for (InputMethodInfo inputMethodInfo : bxntVar.b.a.a().getEnabledInputMethodList()) {
                if (inputMethodInfo.getId().equals(string)) {
                    if (!"com.google.android.inputmethod.latin".equals(inputMethodInfo.getPackageName())) {
                        return;
                    }
                    int min = Math.min(3, bxeuVar.a.size());
                    CompletionInfo[] completionInfoArr = new CompletionInfo[min];
                    for (int i = 0; i < min; i++) {
                        dpui dpuiVar = bxeuVar.a.get(i);
                        String str = true != dpuiVar.c ? "" : " ";
                        if (amb.a(new Locale(dpuiVar.b)) == 1) {
                            String str2 = dpuiVar.a;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + str.length());
                            sb2.append(" ");
                            sb2.append(str2);
                            sb2.append(str);
                            sb = sb2.toString();
                        } else {
                            String str3 = dpuiVar.a;
                            StringBuilder sb3 = new StringBuilder(str.length() + 1 + String.valueOf(str3).length());
                            sb3.append(str);
                            sb3.append(str3);
                            sb3.append(" ");
                            sb = sb3.toString();
                        }
                        completionInfoArr[i] = new CompletionInfo(i, i, sb, dpuiVar.a);
                    }
                    if (min > 1) {
                        CompletionInfo completionInfo = completionInfoArr[0];
                        CompletionInfo completionInfo2 = completionInfoArr[1];
                        completionInfoArr[0] = new CompletionInfo(0L, 0, completionInfo2.getText(), completionInfo2.getLabel());
                        completionInfoArr[1] = new CompletionInfo(1L, 1, completionInfo.getText(), completionInfo.getLabel());
                    }
                    cqhn cqhnVar = bxemVar.b;
                    for (View view : cqkx.n(bxemVar.h)) {
                        cqhu cqhuVar = bxemVar.d;
                        dbsg<EditText> d = hqv.d(view);
                        if (d.a()) {
                            if (bxemVar.a.getSuggestParameters().k) {
                                bxemVar.e.a(d.b(), completionInfoArr);
                            }
                            cjqy cjqyVar = bxemVar.c;
                            cjsx i2 = cjsy.i();
                            i2.b(ddda.fi);
                            cjqyVar.k(i2.a());
                        }
                    }
                    return;
                }
            }
            return;
        }
        ((bxem) this.a).a((bxev) obj);
    }
}
