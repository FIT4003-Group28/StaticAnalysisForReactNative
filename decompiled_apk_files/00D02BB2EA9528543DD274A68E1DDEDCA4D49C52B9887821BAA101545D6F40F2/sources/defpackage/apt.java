package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/* compiled from: PG */
@Deprecated
/* renamed from: apt  reason: default package */
/* loaded from: classes2.dex */
public final class apt {
    private static final Object f = new Object();
    private static apt g;
    public final Context a;
    private final Handler e;
    public final HashMap<BroadcastReceiver, ArrayList<aps>> b = new HashMap<>();
    private final HashMap<String, ArrayList<aps>> d = new HashMap<>();
    public final ArrayList<apr> c = new ArrayList<>();

    private apt(Context context) {
        this.a = context;
        this.e = new apq(this, context.getMainLooper());
    }

    public static apt a(Context context) {
        apt aptVar;
        synchronized (f) {
            if (g == null) {
                g = new apt(context.getApplicationContext());
            }
            aptVar = g;
        }
        return aptVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            aps apsVar = new aps(intentFilter, broadcastReceiver);
            ArrayList<aps> arrayList = this.b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(apsVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<aps> arrayList2 = this.d.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.d.put(action, arrayList2);
                }
                arrayList2.add(apsVar);
            }
        }
    }

    public final void c(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            ArrayList<aps> remove = this.b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            int size = remove.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                aps apsVar = remove.get(size);
                apsVar.d = true;
                for (int i = 0; i < apsVar.a.countActions(); i++) {
                    String action = apsVar.a.getAction(i);
                    ArrayList<aps> arrayList = this.d.get(action);
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            aps apsVar2 = arrayList.get(size2);
                            if (apsVar2.b == broadcastReceiver) {
                                apsVar2.d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.d.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void d(Intent intent) {
        String str;
        int i;
        ArrayList arrayList;
        String str2;
        ArrayList<aps> arrayList2;
        synchronized (this.b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            int flags = intent.getFlags() & 8;
            if (flags != 0) {
                String str3 = "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent;
            }
            ArrayList<aps> arrayList3 = this.d.get(intent.getAction());
            if (arrayList3 != null) {
                if (flags != 0) {
                    String str4 = "Action list: " + arrayList3;
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    aps apsVar = arrayList3.get(i2);
                    if (flags != 0) {
                        String str5 = "Matching against filter " + apsVar.a;
                    }
                    if (apsVar.c) {
                        i = i2;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                    } else {
                        str = action;
                        i = i2;
                        arrayList = arrayList4;
                        str2 = resolveTypeIfNeeded;
                        arrayList2 = arrayList3;
                        int match = apsVar.a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (flags != 0) {
                                String str6 = "  Filter matched!  match=0x" + Integer.toHexString(match);
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(apsVar);
                            apsVar.c = true;
                            i2 = i + 1;
                            action = str;
                            resolveTypeIfNeeded = str2;
                            arrayList3 = arrayList2;
                        } else if (flags != 0) {
                            String str7 = "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category");
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    resolveTypeIfNeeded = str2;
                    arrayList3 = arrayList2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((aps) arrayList5.get(i3)).c = false;
                    }
                    this.c.add(new apr(intent, arrayList5));
                    if (!this.e.hasMessages(1)) {
                        this.e.sendEmptyMessage(1);
                    }
                }
            }
        }
    }
}
