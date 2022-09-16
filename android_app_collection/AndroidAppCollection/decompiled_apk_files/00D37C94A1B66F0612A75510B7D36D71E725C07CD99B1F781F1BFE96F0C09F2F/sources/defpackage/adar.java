package defpackage;

import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import java.io.IOException;
import org.xml.sax.SAXException;
/* compiled from: PG */
/* renamed from: adar  reason: default package */
/* loaded from: classes.dex */
public final class adar implements adwb, afts {
    public AppStatus a = AppStatus.d(-2);
    final /* synthetic */ adas b;
    private final String c;

    public adar(adas adasVar, String str) {
        this.b = adasVar;
        this.c = str;
    }

    @Override // defpackage.adwb
    public final void a(IOException iOException) {
        String str = adas.a;
        String str2 = this.c;
        zep.f(str, str2.length() != 0 ? "Failed getting app status from ".concat(str2) : new String("Failed getting app status from "), iOException);
    }

    @Override // defpackage.afts
    /* renamed from: c */
    public final AppStatus b(cew cewVar) {
        int i = cewVar.a;
        if (i == 404) {
            AppStatus d = AppStatus.d(-1);
            this.a = d;
            return d;
        } else if (i != 200) {
            String str = adas.a;
            String str2 = this.c;
            StringBuilder sb = new StringBuilder(str2.length() + 61);
            sb.append("Request for TV app status from ");
            sb.append(str2);
            sb.append(" got response code ");
            sb.append(i);
            zep.c(str, sb.toString());
            AppStatus d2 = AppStatus.d(-2);
            this.a = d2;
            return d2;
        } else {
            byte[] bArr = cewVar.b;
            if (bArr.length == 0) {
                String str3 = adas.a;
                this.c.length();
                return this.a;
            }
            adap adapVar = new adap();
            try {
                adas.b(aoob.x(bArr).m(), adapVar);
                int i2 = adapVar.c;
                if (i2 < 0) {
                    AppStatus d3 = AppStatus.d(-2);
                    this.a = d3;
                    return d3;
                }
                adit aditVar = null;
                ScreenId screenId = (adapVar.b() == null || !adapVar.c().equals(this.b.c)) ? null : new ScreenId(adapVar.b());
                if (adapVar.e() != null && adapVar.c().equals(this.b.c)) {
                    aditVar = adapVar.e();
                }
                adhw c = AppStatus.c();
                c.e(i2);
                c.a = adapVar.a;
                c.c = adapVar.b;
                c.b = screenId;
                c.e = aditVar;
                c.f(adapVar.d);
                c.d(adapVar.d());
                c.c(adapVar.e);
                c.b(adapVar.f);
                c.d = adapVar.a();
                AppStatus a = c.a();
                this.a = a;
                return a;
            } catch (IOException | SAXException e) {
                String str4 = adas.a;
                String str5 = this.c;
                zep.f(str4, str5.length() != 0 ? "Failed getting app status from ".concat(str5) : new String("Failed getting app status from "), e);
                return this.a;
            }
        }
    }

    @Override // defpackage.adwb
    public final void i(yrb yrbVar) {
        int i = yrbVar.a;
        if (i == 404) {
            this.a = AppStatus.d(-1);
        } else if (i != 200) {
            String str = adas.a;
            String str2 = this.c;
            StringBuilder sb = new StringBuilder(str2.length() + 61);
            sb.append("Request for TV app status from ");
            sb.append(str2);
            sb.append(" got response code ");
            sb.append(i);
            zep.c(str, sb.toString());
            this.a = AppStatus.d(-2);
        } else {
            yqz yqzVar = yrbVar.d;
            if (yqzVar == null) {
                String str3 = adas.a;
                this.c.length();
                return;
            }
            adap adapVar = new adap();
            try {
                adas.b(yqzVar.b(), adapVar);
                int i2 = adapVar.c;
                if (i2 < 0) {
                    this.a = AppStatus.d(-2);
                    return;
                }
                adit aditVar = null;
                ScreenId screenId = (adapVar.b() == null || !adapVar.c().equals(this.b.c)) ? null : new ScreenId(adapVar.b());
                if (adapVar.e() != null && adapVar.c().equals(this.b.c)) {
                    aditVar = adapVar.e();
                }
                adhw c = AppStatus.c();
                c.e(i2);
                c.a = adapVar.a;
                c.c = adapVar.b;
                c.b = screenId;
                c.e = aditVar;
                c.f(adapVar.d);
                c.d(adapVar.d());
                c.c(adapVar.e);
                c.b(adapVar.f);
                c.d = adapVar.a();
                this.a = c.a();
            } catch (IOException | SAXException e) {
                String str4 = adas.a;
                String str5 = this.c;
                zep.f(str4, str5.length() != 0 ? "Failed getting app status from ".concat(str5) : new String("Failed getting app status from "), e);
            }
        }
    }
}
