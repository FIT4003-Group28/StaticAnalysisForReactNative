package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* compiled from: ShareCompat.java */
/* loaded from: classes.dex */
public final class ae {

    /* compiled from: ShareCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Activity f203a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f204b = new Intent().setAction("android.intent.action.SEND");

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<String> f205c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<String> f206d;
        private ArrayList<String> e;
        private ArrayList<Uri> f;

        public static a a(Activity activity) {
            return new a(activity);
        }

        private a(Activity activity) {
            this.f203a = activity;
            this.f204b.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
            this.f204b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", activity.getComponentName());
            this.f204b.addFlags(PKIFailureInfo.signerNotTrusted);
        }

        public Intent a() {
            if (this.f205c != null) {
                a("android.intent.extra.EMAIL", this.f205c);
                this.f205c = null;
            }
            if (this.f206d != null) {
                a("android.intent.extra.CC", this.f206d);
                this.f206d = null;
            }
            if (this.e != null) {
                a("android.intent.extra.BCC", this.e);
                this.e = null;
            }
            boolean z = true;
            if (this.f == null || this.f.size() <= 1) {
                z = false;
            }
            boolean equals = this.f204b.getAction().equals("android.intent.action.SEND_MULTIPLE");
            if (!z && equals) {
                this.f204b.setAction("android.intent.action.SEND");
                if (this.f != null && !this.f.isEmpty()) {
                    this.f204b.putExtra("android.intent.extra.STREAM", this.f.get(0));
                } else {
                    this.f204b.removeExtra("android.intent.extra.STREAM");
                }
                this.f = null;
            }
            if (z && !equals) {
                this.f204b.setAction("android.intent.action.SEND_MULTIPLE");
                if (this.f != null && !this.f.isEmpty()) {
                    this.f204b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f);
                } else {
                    this.f204b.removeExtra("android.intent.extra.STREAM");
                }
            }
            return this.f204b;
        }

        private void a(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f204b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f204b.putExtra(str, strArr);
        }

        public a a(String str) {
            this.f204b.setType(str);
            return this;
        }

        public a a(CharSequence charSequence) {
            this.f204b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        public a b(String str) {
            this.f204b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }
    }
}
