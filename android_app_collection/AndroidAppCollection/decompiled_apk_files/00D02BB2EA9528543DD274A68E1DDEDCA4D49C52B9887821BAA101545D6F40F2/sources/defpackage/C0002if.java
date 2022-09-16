package defpackage;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: if  reason: invalid class name and default package and case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0002if {
    public final CharSequence a;
    public final akj b;
    private final long c;
    private final Bundle d = new Bundle();
    private String e;
    private Uri f;

    public C0002if(CharSequence charSequence, long j, akj akjVar) {
        this.a = charSequence;
        this.c = j;
        this.b = akjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle[] a(List<C0002if> list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0002if c0002if = list.get(i);
            Bundle bundle = new Bundle();
            CharSequence charSequence = c0002if.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", c0002if.c);
            akj akjVar = c0002if.b;
            if (akjVar != null) {
                bundle.putCharSequence("sender", akjVar.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", c0002if.b.c());
                } else {
                    bundle.putBundle("person", c0002if.b.b());
                }
            }
            String str = c0002if.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = c0002if.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            bundle.putBundle("extras", c0002if.d);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<defpackage.C0002if> b(android.os.Parcelable[] r17) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0002if.b(android.os.Parcelable[]):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message message;
        akj akjVar = this.b;
        CharSequence charSequence = null;
        Person person = null;
        if (Build.VERSION.SDK_INT >= 28) {
            CharSequence charSequence2 = this.a;
            long j = this.c;
            if (akjVar != null) {
                person = akjVar.c();
            }
            message = new Notification.MessagingStyle.Message(charSequence2, j, person);
        } else {
            CharSequence charSequence3 = this.a;
            long j2 = this.c;
            if (akjVar != null) {
                charSequence = akjVar.a;
            }
            message = new Notification.MessagingStyle.Message(charSequence3, j2, charSequence);
        }
        String str = this.e;
        if (str != null) {
            message.setData(str, this.f);
        }
        return message;
    }
}
