package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@VisibleForTesting
/* loaded from: classes.dex */
public class DataLayer {
    public static final String EVENT_KEY = "event";
    public static final Object OBJECT_NOT_PRESENT = new Object();
    private static final String[] zzaxd = "gtm.lifetime".toString().split("\\.");
    private static final Pattern zzaxe = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap<zzb, Integer> zzaxf;
    private final Map<String, Object> zzaxg;
    private final ReentrantLock zzaxh;
    private final LinkedList<Map<String, Object>> zzaxi;
    private final zzc zzaxj;
    private final CountDownLatch zzaxk;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class zza {
        public final String mKey;
        public final Object mValue;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zza(String str, Object obj) {
            this.mKey = str;
            this.mValue = obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            return this.mKey.equals(zzaVar.mKey) && this.mValue.equals(zzaVar.mValue);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Integer[]{Integer.valueOf(this.mKey.hashCode()), Integer.valueOf(this.mValue.hashCode())});
        }

        public final String toString() {
            String str = this.mKey;
            String obj = this.mValue.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(obj).length());
            sb.append("Key: ");
            sb.append(str);
            sb.append(" value: ");
            sb.append(obj);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface zzb {
        void zze(Map<String, Object> map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface zzc {
        void zza(zzaq zzaqVar);

        void zza(List<zza> list, long j);

        void zzct(String str);
    }

    @VisibleForTesting
    DataLayer() {
        this(new zzao());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataLayer(zzc zzcVar) {
        this.zzaxj = zzcVar;
        this.zzaxf = new ConcurrentHashMap<>();
        this.zzaxg = new HashMap();
        this.zzaxh = new ReentrantLock();
        this.zzaxi = new LinkedList<>();
        this.zzaxk = new CountDownLatch(1);
        this.zzaxj.zza(new zzap(this));
    }

    @VisibleForTesting
    public static List<Object> listOf(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    @VisibleForTesting
    public static Map<String, Object> mapOf(Object... objArr) {
        if (objArr.length % 2 != 0) {
            throw new IllegalArgumentException("expected even number of key-value pairs");
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            if (!(objArr[i] instanceof String)) {
                String valueOf = String.valueOf(objArr[i]);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("key is not a string: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            hashMap.put((String) objArr[i], objArr[i + 1]);
        }
        return hashMap;
    }

    @VisibleForTesting
    private final void zza(List<Object> list, List<Object> list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                zza((List) obj, (List) list2.get(i));
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                zzb((Map) obj, (Map) list2.get(i));
            } else if (obj != OBJECT_NOT_PRESENT) {
                list2.set(i, obj);
            }
        }
    }

    private final void zza(Map<String, Object> map, String str, Collection<zza> collection) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String str2 = str.length() == 0 ? "" : ".";
            String key = entry.getKey();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(key).length());
            sb.append(str);
            sb.append(str2);
            sb.append(key);
            String sb2 = sb.toString();
            if (entry.getValue() instanceof Map) {
                zza((Map) entry.getValue(), sb2, collection);
            } else if (!sb2.equals("gtm.lifetime")) {
                collection.add(new zza(sb2, entry.getValue()));
            }
        }
    }

    @VisibleForTesting
    private final void zzb(Map<String, Object> map, Map<String, Object> map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                zza((List) obj, (List) map2.get(str));
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                zzb((Map) obj, (Map) map2.get(str));
            } else {
                map2.put(str, obj);
            }
        }
    }

    @VisibleForTesting
    private static Long zzcs(String str) {
        long j;
        long j2;
        long j3;
        Matcher matcher = zzaxe.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            zzdi.zzcw(valueOf.length() != 0 ? "unknown _lifetime: ".concat(valueOf) : new String("unknown _lifetime: "));
            return null;
        }
        try {
            j = Long.parseLong(matcher.group(1));
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            zzdi.zzaa(valueOf2.length() != 0 ? "illegal number in _lifetime value: ".concat(valueOf2) : new String("illegal number in _lifetime value: "));
            j = 0;
        }
        if (j <= 0) {
            String valueOf3 = String.valueOf(str);
            zzdi.zzcw(valueOf3.length() != 0 ? "non-positive _lifetime: ".concat(valueOf3) : new String("non-positive _lifetime: "));
            return null;
        }
        String group = matcher.group(2);
        if (group.length() == 0) {
            return Long.valueOf(j);
        }
        char charAt = group.charAt(0);
        if (charAt != 'd') {
            if (charAt == 'h') {
                j3 = j * 1000 * 60;
            } else if (charAt == 'm') {
                j3 = j * 1000;
            } else if (charAt != 's') {
                String valueOf4 = String.valueOf(str);
                zzdi.zzaa(valueOf4.length() != 0 ? "unknown units in _lifetime: ".concat(valueOf4) : new String("unknown units in _lifetime: "));
                return null;
            } else {
                j2 = j * 1000;
            }
            j2 = j3 * 60;
        } else {
            j2 = j * 1000 * 60 * 60 * 24;
        }
        return Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(Map<String, Object> map) {
        Long l;
        this.zzaxh.lock();
        try {
            this.zzaxi.offer(map);
            int i = 0;
            if (this.zzaxh.getHoldCount() == 1) {
                int i2 = 0;
                do {
                    Map<String, Object> poll = this.zzaxi.poll();
                    if (poll != null) {
                        synchronized (this.zzaxg) {
                            for (String str : poll.keySet()) {
                                zzb(zzk(str, poll.get(str)), this.zzaxg);
                            }
                        }
                        for (zzb zzbVar : this.zzaxf.keySet()) {
                            zzbVar.zze(poll);
                        }
                        i2++;
                    }
                } while (i2 <= 500);
                this.zzaxi.clear();
                throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
            }
            String[] strArr = zzaxd;
            int length = strArr.length;
            Object obj = map;
            while (true) {
                l = null;
                if (i >= length) {
                    break;
                }
                String str2 = strArr[i];
                if (!(obj instanceof Map)) {
                    obj = null;
                    break;
                } else {
                    obj = ((Map) obj).get(str2);
                    i++;
                }
            }
            if (obj != null) {
                l = zzcs(obj.toString());
            }
            if (l != null) {
                ArrayList arrayList = new ArrayList();
                zza(map, "", arrayList);
                this.zzaxj.zza(arrayList, l.longValue());
            }
        } finally {
            this.zzaxh.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> zzk(String str, Object obj) {
        HashMap hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        HashMap hashMap2 = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap3 = new HashMap();
            hashMap2.put(split[i], hashMap3);
            i++;
            hashMap2 = hashMap3;
        }
        hashMap2.put(split[split.length - 1], obj);
        return hashMap;
    }

    public Object get(String str) {
        String[] split;
        synchronized (this.zzaxg) {
            Object obj = this.zzaxg;
            for (String str2 : str.split("\\.")) {
                if (!(obj instanceof Map)) {
                    return null;
                }
                obj = ((Map) obj).get(str2);
                if (obj == null) {
                    return null;
                }
            }
            return obj;
        }
    }

    public void push(String str, Object obj) {
        push(zzk(str, obj));
    }

    public void push(Map<String, Object> map) {
        try {
            this.zzaxk.await();
        } catch (InterruptedException unused) {
            zzdi.zzaa("DataLayer.push: unexpected InterruptedException");
        }
        zzg(map);
    }

    public void pushEvent(String str, Map<String, Object> map) {
        HashMap hashMap = new HashMap(map);
        hashMap.put(EVENT_KEY, str);
        push(hashMap);
    }

    public String toString() {
        String sb;
        synchronized (this.zzaxg) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, Object> entry : this.zzaxg.entrySet()) {
                sb2.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", entry.getKey(), entry.getValue()));
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzb zzbVar) {
        this.zzaxf.put(zzbVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzcr(String str) {
        push(str, null);
        this.zzaxj.zzct(str);
    }
}
