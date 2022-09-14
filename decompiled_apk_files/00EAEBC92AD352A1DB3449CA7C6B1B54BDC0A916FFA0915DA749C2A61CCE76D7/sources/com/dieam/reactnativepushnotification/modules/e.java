package com.dieam.reactnativepushnotification.modules;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import c.d.j.o.c;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f5133a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f5134b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f5135c;

    /* renamed from: d  reason: collision with root package name */
    private c f5136d;

    /* loaded from: classes.dex */
    class a extends c.d.j.g.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f5137a;

        a(e eVar, e eVar2) {
            this.f5137a = eVar2;
        }

        @Override // c.d.j.g.b
        public void a(Bitmap bitmap) {
            this.f5137a.a(bitmap);
        }

        @Override // c.d.e.b
        public void e(c.d.e.c<c.d.d.h.a<c.d.j.k.b>> cVar) {
            this.f5137a.a(null);
        }
    }

    /* loaded from: classes.dex */
    class b extends c.d.j.g.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f5138a;

        b(e eVar, e eVar2) {
            this.f5138a = eVar2;
        }

        @Override // c.d.j.g.b
        public void a(Bitmap bitmap) {
            this.f5138a.b(bitmap);
        }

        @Override // c.d.e.b
        public void e(c.d.e.c<c.d.d.h.a<c.d.j.k.b>> cVar) {
            this.f5138a.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void a(Bitmap bitmap, Bitmap bitmap2);
    }

    public e(c cVar) {
        this.f5136d = cVar;
    }

    private void a() {
        synchronized (this.f5133a) {
            if (this.f5133a.incrementAndGet() >= 2 && this.f5136d != null) {
                this.f5136d.a(this.f5134b, this.f5135c);
            }
        }
    }

    private void a(Context context, Uri uri, c.d.j.g.b bVar) {
        c.d.j.o.d b2 = c.d.j.o.d.b(uri);
        b2.a(c.d.j.e.d.HIGH);
        b2.a(c.b.FULL_FETCH);
        c.d.j.o.c a2 = b2.a();
        if (!c.d.h.a.a.c.c()) {
            c.d.h.a.a.c.a(context);
        }
        c.d.h.a.a.c.a().a(a2, context).a(bVar, c.d.d.b.a.a());
    }

    public void a(Context context, String str) {
        if (str == null) {
            a(null);
            return;
        }
        try {
            a(context, Uri.parse(str), new a(this, this));
        } catch (Exception e2) {
            Log.e(RNPushNotification.LOG_TAG, "Failed to parse bigPictureUrl", e2);
            a(null);
        }
    }

    public void a(Bitmap bitmap) {
        this.f5135c = bitmap;
        a();
    }

    public void b(Context context, String str) {
        if (str == null) {
            b(null);
            return;
        }
        try {
            a(context, Uri.parse(str), new b(this, this));
        } catch (Exception e2) {
            Log.e(RNPushNotification.LOG_TAG, "Failed to parse largeIconUrl", e2);
            b(null);
        }
    }

    public void b(Bitmap bitmap) {
        this.f5134b = bitmap;
        a();
    }
}
