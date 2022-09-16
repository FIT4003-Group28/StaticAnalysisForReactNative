package com.baidu.lbsapi.auth;

import android.content.Context;
import java.util.Hashtable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f1502a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f1503b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f1504c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f1505d;
    final /* synthetic */ Hashtable e;
    final /* synthetic */ h f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(h hVar, int i, boolean z, String str, String str2, Hashtable hashtable) {
        this.f = hVar;
        this.f1502a = i;
        this.f1503b = z;
        this.f1504c = str;
        this.f1505d = str2;
        this.e = hashtable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        boolean b2;
        n nVar;
        boolean b3;
        if (a.f1483a) {
            StringBuilder sb = new StringBuilder();
            sb.append("status = ");
            sb.append(this.f1502a);
            sb.append("; forced = ");
            sb.append(this.f1503b);
            sb.append("checkAK = ");
            b3 = this.f.b(this.f1504c);
            sb.append(b3);
            a.a(sb.toString());
        }
        if (this.f1502a != 601 && !this.f1503b && this.f1502a != -1) {
            b2 = this.f.b(this.f1504c);
            if (!b2) {
                if (602 == this.f1502a) {
                    if (a.f1483a) {
                        a.a("authenticate wait  ");
                    }
                    nVar = h.f1498d;
                    nVar.b();
                } else if (a.f1483a) {
                    a.a("authenticate else  ");
                }
                this.f.a((String) null, this.f1504c);
                return;
            }
        }
        if (a.f1483a) {
            a.a("authenticate sendAuthRequest");
        }
        context = h.f1497a;
        String[] b4 = b.b(context);
        if (a.f1483a) {
            a.a("authStrings.length:" + b4.length);
        }
        if (b4 == null || b4.length <= 1) {
            this.f.a(this.f1503b, this.f1505d, this.e, this.f1504c);
            return;
        }
        if (a.f1483a) {
            a.a("more sha1 auth");
        }
        this.f.a(this.f1503b, this.f1505d, this.e, b4, this.f1504c);
    }
}
