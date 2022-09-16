package defpackage;

import android.util.Log;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: aqh  reason: default package */
/* loaded from: classes2.dex */
public final class aqh {
    public final apy a;
    public final aql b;

    public aqh() {
    }

    public static aqh a(apy apyVar) {
        return new aqh(apyVar, ((ak) apyVar).getViewModelStore());
    }

    public static boolean b(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    @Deprecated
    public final void c(String str, PrintWriter printWriter) {
        aql aqlVar = this.b;
        if (aqlVar.d.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < aqlVar.d.c(); i++) {
                aqi aqiVar = (aqi) aqlVar.d.g(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(aqlVar.d.b(i));
                printWriter.print(": ");
                printWriter.println(aqiVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(aqiVar.e);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(aqiVar.f);
                aqp aqpVar = aqiVar.f;
                String str3 = str2 + "  ";
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(aqpVar.d);
                printWriter.print(" mListener=");
                printWriter.println(aqpVar.e);
                if (aqpVar.g || aqpVar.j) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(aqpVar.g);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(aqpVar.j);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (aqpVar.h || aqpVar.i) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(aqpVar.h);
                    printWriter.print(" mReset=");
                    printWriter.println(aqpVar.i);
                }
                aqn aqnVar = (aqn) aqpVar;
                if (aqnVar.a != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(aqnVar.a);
                    printWriter.print(" waiting=");
                    boolean z = aqnVar.a.a;
                    printWriter.println(false);
                }
                if (aqnVar.b != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(aqnVar.b);
                    printWriter.print(" waiting=");
                    boolean z2 = aqnVar.b.a;
                    printWriter.println(false);
                }
                if (aqiVar.g != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aqiVar.g);
                    aqj aqjVar = aqiVar.g;
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(aqjVar.c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                aqp aqpVar2 = aqiVar.f;
                printWriter.println(aqp.e(aqiVar.a()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(aqiVar.l());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.a.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.a)));
        sb.append("}}");
        return sb.toString();
    }

    public aqh(apy apyVar, aj ajVar) {
        this.a = apyVar;
        this.b = (aql) new ai(ajVar, aql.a).a(aql.class);
    }
}
