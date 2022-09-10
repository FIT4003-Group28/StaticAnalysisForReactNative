package defpackage;

import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import com.google.android.apps.maps.R;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: afet  reason: default package */
/* loaded from: classes2.dex */
public class afet implements afer {
    public final gga a;
    private final dxio<afha> b;

    public afet(dxio<afha> dxioVar, gga ggaVar) {
        this.a = ggaVar;
        this.b = dxioVar;
    }

    @Override // defpackage.afer
    public CharSequence a() {
        return this.a.getString(R.string.ENTER_INCOGNITO_BOTTOMSHEET_ALERT_DIALOG_TITLE);
    }

    @Override // defpackage.afer
    public CharSequence b() {
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = this.a.getString(R.string.ENTER_INCOGNITO_BOTTOMSHEET_ALERT_DIALOG_MESSAGE_PREFIX);
        spannableStringBuilder.append((CharSequence) string);
        String string2 = this.a.getString(R.string.ENTER_INCOGNITO_BOTTOMSHEET_ALERT_DIALOG_MESSAGE1_WITH_BULLET);
        arrayList.add(string2);
        spannableStringBuilder.append((CharSequence) string2);
        String string3 = this.a.getString(R.string.ENTER_INCOGNITO_BOTTOMSHEET_ALERT_DIALOG_MESSAGE2_WITH_BULLET);
        arrayList.add(string3);
        spannableStringBuilder.append((CharSequence) string3);
        String string4 = this.a.getString(R.string.ENTER_INCOGNITO_BOTTOMSHEET_ALERT_DIALOG_MESSAGE3_WITH_BULLET);
        arrayList.add(string4);
        spannableStringBuilder.append((CharSequence) string4);
        spannableStringBuilder.append((CharSequence) this.a.getString(R.string.ENTER_INCOGNITO_BOTTOMSHEET_ALERT_DIALOG_MESSAGE_SUFFIX));
        int length = string.length();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int length2 = ((String) arrayList.get(i)).length() + length;
            spannableStringBuilder.setSpan(new BulletSpan(25), length, length2, 0);
            i++;
            length = length2;
        }
        return spannableStringBuilder;
    }

    @Override // defpackage.afer
    public cqkl c() {
        this.a.g().f();
        return cqkl.a;
    }

    @Override // defpackage.afer
    public cqkl d() {
        final Intent b = GoogleHelp.a(this.a.getString(R.string.INCOGNITO_OTA_ANDROID_CONTEXT_STRING)).b();
        this.b.a().G(new Runnable(this, b) { // from class: afes
            private final afet a;
            private final Intent b;

            {
                this.a = this;
                this.b = b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afet afetVar = this.a;
                new codt(afetVar.a).a(this.b);
            }
        });
        return cqkl.a;
    }
}
