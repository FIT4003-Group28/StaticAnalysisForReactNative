package a.o.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f498f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static a f499g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f500a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f501b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f502c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<b> f503d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Handler f504e;

    /* renamed from: a.o.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class HandlerC0029a extends Handler {
        HandlerC0029a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final Intent f506a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<c> f507b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f506a = intent;
            this.f507b = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        final IntentFilter f508a;

        /* renamed from: b  reason: collision with root package name */
        final BroadcastReceiver f509b;

        /* renamed from: c  reason: collision with root package name */
        boolean f510c;

        /* renamed from: d  reason: collision with root package name */
        boolean f511d;

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f509b);
            sb.append(" filter=");
            sb.append(this.f508a);
            if (this.f511d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private a(Context context) {
        this.f500a = context;
        this.f504e = new HandlerC0029a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f498f) {
            if (f499g == null) {
                f499g = new a(context.getApplicationContext());
            }
            aVar = f499g;
        }
        return aVar;
    }

    void a() {
        b[] bVarArr;
        while (true) {
            synchronized (this.f501b) {
                int size = this.f503d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f503d.toArray(bVarArr);
                this.f503d.clear();
            }
            for (b bVar : bVarArr) {
                int size2 = bVar.f507b.size();
                for (int i = 0; i < size2; i++) {
                    c cVar = bVar.f507b.get(i);
                    if (!cVar.f511d) {
                        cVar.f509b.onReceive(this.f500a, bVar.f506a);
                    }
                }
            }
        }
    }

    public boolean a(Intent intent) {
        String str;
        ArrayList arrayList;
        int i;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f501b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f500a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f502c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    c cVar = arrayList3.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f508a);
                    }
                    if (cVar.f510c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        str = action;
                        arrayList = arrayList4;
                        i = i2;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = cVar.f508a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f510c = true;
                            i2 = i + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((c) arrayList5.get(i3)).f510c = false;
                    }
                    this.f503d.add(new b(intent, arrayList5));
                    if (!this.f504e.hasMessages(1)) {
                        this.f504e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
