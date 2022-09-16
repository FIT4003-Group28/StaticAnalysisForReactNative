package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.widget.ListAdapter;
import com.google.protos.youtube.api.innertube.ModifyReportFormCommandOuterClass$ModifyReportFormCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajuw  reason: default package */
/* loaded from: classes.dex */
public final class ajuw {
    public final Context a;
    public final aafo b;
    public final acti c;
    private final aken d;

    public ajuw(Context context, aafo aafoVar, acti actiVar, aken akenVar) {
        this.a = context;
        aafoVar.getClass();
        this.b = aafoVar;
        this.c = actiVar;
        this.d = akenVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(apzg apzgVar, ajut ajutVar) {
        if (apzgVar == null || !apzgVar.qn(ModifyReportFormCommandOuterClass$ModifyReportFormCommand.modifyReportFormCommand)) {
            return;
        }
        int aC = akel.aC(((ModifyReportFormCommandOuterClass$ModifyReportFormCommand) apzgVar.qm(ModifyReportFormCommandOuterClass$ModifyReportFormCommand.modifyReportFormCommand)).b);
        if (aC == 0) {
            aC = 1;
        }
        if (aC == 4) {
            ajutVar.e();
            return;
        }
        arag aragVar = null;
        apoj apojVar = null;
        if (aC == 5) {
            ajuy ajuyVar = ajutVar.b;
            apok apokVar = ajuyVar.a.g;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((1 & apokVar.b) != 0) {
                apok apokVar2 = ajuyVar.a.g;
                if (apokVar2 == null) {
                    apokVar2 = apok.a;
                }
                apojVar = apokVar2.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
            }
            ajutVar.c(apojVar);
        } else if (aC != 2) {
            if (aC != 3) {
                return;
            }
            ajutVar.a();
        } else {
            apnn a = ajutVar.b.a();
            if (a == null) {
                return;
            }
            ajux ajuxVar = ajutVar.c;
            if ((1 & a.b) != 0 && (aragVar = a.c) == null) {
                aragVar = arag.a;
            }
            Spanned a2 = aafv.a(aragVar, ajutVar.a, false);
            ajuxVar.d.setVisibility(0);
            ajuxVar.e.setContentDescription(a2);
            ajuxVar.e.setVisibility(0);
            ajuxVar.f.setText(a2);
            ajuxVar.f.setVisibility(0);
        }
    }

    public final void b(atui atuiVar, Map map) {
        if ((atuiVar.b & 32) != 0) {
            aafo aafoVar = this.b;
            apzg apzgVar = atuiVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, map);
        }
    }

    public final void c(aunm aunmVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        if (zew.B(this.a).isFinishing()) {
            return;
        }
        ajut ajutVar = new ajut(this.a, this.b, new ajuy(aunmVar), new ajuu(this, obj), this.d);
        if (ajutVar.d.isShowing()) {
            return;
        }
        ajux ajuxVar = ajutVar.c;
        ajuy ajuyVar = ajutVar.b;
        aunm aunmVar2 = ajuyVar.a;
        arag aragVar3 = null;
        if ((aunmVar2.b & 2) != 0) {
            aragVar = aunmVar2.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        atul atulVar = ajuyVar.b;
        if ((atulVar.b & 1) != 0) {
            aragVar2 = atulVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        ajuxVar.a.setText((Spanned) akzj.d(b, ajgl.b(aragVar2)));
        ajutVar.c.b.setAdapter((ListAdapter) ajutVar.e);
        ajuy ajuyVar2 = ajutVar.b;
        aafo aafoVar = ajutVar.a;
        aunm aunmVar3 = ajuyVar2.a;
        if ((aunmVar3.b & 8) != 0 && (aragVar3 = aunmVar3.e) == null) {
            aragVar3 = arag.a;
        }
        Spanned a = aafv.a(aragVar3, aafoVar, false);
        if (a != null) {
            ajux ajuxVar2 = ajutVar.c;
            ajuxVar2.c.setText(a);
            ajuxVar2.c.setVisibility(0);
        }
        ajutVar.e.setNotifyOnChange(false);
        ajutVar.e.clear();
        ajutVar.e.addAll(ajutVar.b.b.c);
        ajutVar.e.setNotifyOnChange(true);
        ajutVar.d.show();
        ajutVar.b();
    }
}
