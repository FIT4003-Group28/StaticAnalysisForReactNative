package android.support.v4.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.baidu.mapapi.UIMsg;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/* compiled from: LocalBroadcastManager.java */
/* loaded from: classes.dex */
public final class c {
    private static final Object f = new Object();
    private static c g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f161a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<b>> f162b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, ArrayList<b>> f163c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f164d = new ArrayList<>();
    private final Handler e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final IntentFilter f168a;

        /* renamed from: b  reason: collision with root package name */
        final BroadcastReceiver f169b;

        /* renamed from: c  reason: collision with root package name */
        boolean f170c;

        /* renamed from: d  reason: collision with root package name */
        boolean f171d;

        b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f168a = intentFilter;
            this.f169b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f169b);
            sb.append(" filter=");
            sb.append(this.f168a);
            if (this.f171d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f166a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<b> f167b;

        a(Intent intent, ArrayList<b> arrayList) {
            this.f166a = intent;
            this.f167b = arrayList;
        }
    }

    public static c a(Context context) {
        c cVar;
        synchronized (f) {
            if (g == null) {
                g = new c(context.getApplicationContext());
            }
            cVar = g;
        }
        return cVar;
    }

    private c(Context context) {
        this.f161a = context;
        this.e = new Handler(context.getMainLooper()) { // from class: android.support.v4.a.c.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    c.this.a();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f162b) {
            b bVar = new b(intentFilter, broadcastReceiver);
            ArrayList<b> arrayList = this.f162b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f162b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<b> arrayList2 = this.f163c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f163c.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f162b) {
            ArrayList<b> remove = this.f162b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                b bVar = remove.get(size);
                bVar.f171d = true;
                for (int i = 0; i < bVar.f168a.countActions(); i++) {
                    String action = bVar.f168a.getAction(i);
                    ArrayList<b> arrayList = this.f163c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            b bVar2 = arrayList.get(size2);
                            if (bVar2.f169b == broadcastReceiver) {
                                bVar2.f171d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f163c.remove(action);
                        }
                    }
                }
            }
        }
    }

    public boolean a(Intent intent) {
        String str;
        ArrayList arrayList;
        int i;
        ArrayList<b> arrayList2;
        String str2;
        Uri uri;
        String str3;
        synchronized (this.f162b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f161a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<b> arrayList3 = this.f163c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    b bVar = arrayList3.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f168a);
                    }
                    if (bVar.f170c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        uri = data;
                        arrayList = arrayList4;
                    } else {
                        IntentFilter intentFilter = bVar.f168a;
                        String str4 = action;
                        str = action;
                        arrayList = arrayList4;
                        i = i2;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        uri = data;
                        int match = intentFilter.match(str4, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(bVar);
                            bVar.f170c = true;
                            i2 = i + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                            data = uri;
                        } else if (z) {
                            switch (match) {
                                case -4:
                                    str3 = "category";
                                    break;
                                case -3:
                                    str3 = "action";
                                    break;
                                case UIMsg.UIOffType.MSG_OFFLINE_WIFICONNECT /* -2 */:
                                    str3 = DataBufferSafeParcelable.DATA_FIELD;
                                    break;
                                case -1:
                                    str3 = "type";
                                    break;
                                default:
                                    str3 = "unknown reason";
                                    break;
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str3);
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                    data = uri;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((b) arrayList5.get(i3)).f170c = false;
                    }
                    this.f164d.add(new a(intent, arrayList5));
                    if (!this.e.hasMessages(1)) {
                        this.e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        a[] aVarArr;
        while (true) {
            synchronized (this.f162b) {
                int size = this.f164d.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                this.f164d.toArray(aVarArr);
                this.f164d.clear();
            }
            for (a aVar : aVarArr) {
                int size2 = aVar.f167b.size();
                for (int i = 0; i < size2; i++) {
                    b bVar = aVar.f167b.get(i);
                    if (!bVar.f171d) {
                        bVar.f169b.onReceive(this.f161a, aVar.f166a);
                    }
                }
            }
        }
    }
}
