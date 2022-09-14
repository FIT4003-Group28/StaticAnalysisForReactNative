package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: EventsFilesManager.java */
/* loaded from: classes.dex */
public abstract class b<T> {
    public static final int MAX_BYTE_SIZE_PER_FILE = 8000;
    public static final int MAX_FILES_IN_BATCH = 1;
    public static final int MAX_FILES_TO_KEEP = 100;
    public static final String ROLL_OVER_FILE_NAME_SEPARATOR = "_";
    protected final Context context;
    protected final k currentTimeProvider;
    private final int defaultMaxFilesToKeep;
    protected final c eventStorage;
    protected volatile long lastRollOverTime;
    protected final List<d> rollOverListeners = new CopyOnWriteArrayList();
    protected final b.a.a.a.a.d.a<T> transform;

    protected abstract String generateUniqueRollOverFileName();

    /* JADX INFO: Access modifiers changed from: protected */
    public int getMaxByteSizePerFile() {
        return MAX_BYTE_SIZE_PER_FILE;
    }

    public b(Context context, b.a.a.a.a.d.a<T> aVar, k kVar, c cVar, int i) {
        this.context = context.getApplicationContext();
        this.transform = aVar;
        this.eventStorage = cVar;
        this.currentTimeProvider = kVar;
        this.lastRollOverTime = this.currentTimeProvider.a();
        this.defaultMaxFilesToKeep = i;
    }

    public void writeEvent(T t) {
        byte[] bytes = this.transform.toBytes(t);
        rollFileOverIfNeeded(bytes.length);
        this.eventStorage.a(bytes);
    }

    public void registerRollOverListener(d dVar) {
        if (dVar != null) {
            this.rollOverListeners.add(dVar);
        }
    }

    public boolean rollFileOver() {
        String str;
        boolean z = true;
        if (!this.eventStorage.b()) {
            str = generateUniqueRollOverFileName();
            this.eventStorage.a(str);
            b.a.a.a.a.b.i.a(this.context, 4, "Fabric", String.format(Locale.US, "generated new file %s", str));
            this.lastRollOverTime = this.currentTimeProvider.a();
        } else {
            str = null;
            z = false;
        }
        triggerRollOverOnListeners(str);
        return z;
    }

    private void rollFileOverIfNeeded(int i) {
        if (!this.eventStorage.a(i, getMaxByteSizePerFile())) {
            b.a.a.a.a.b.i.a(this.context, 4, "Fabric", String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", Integer.valueOf(this.eventStorage.a()), Integer.valueOf(i), Integer.valueOf(getMaxByteSizePerFile())));
            rollFileOver();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getMaxFilesToKeep() {
        return this.defaultMaxFilesToKeep;
    }

    public long getLastRollOverTime() {
        return this.lastRollOverTime;
    }

    private void triggerRollOverOnListeners(String str) {
        for (d dVar : this.rollOverListeners) {
            try {
                dVar.onRollOver(str);
            } catch (Exception e) {
                b.a.a.a.a.b.i.a(this.context, "One of the roll over listeners threw an exception", e);
            }
        }
    }

    public List<File> getBatchOfFilesToSend() {
        return this.eventStorage.a(1);
    }

    public void deleteSentFiles(List<File> list) {
        this.eventStorage.a(list);
    }

    public void deleteAllEventsFiles() {
        this.eventStorage.a(this.eventStorage.c());
        this.eventStorage.d();
    }

    public void deleteOldestInRollOverIfOverMax() {
        List<File> c2 = this.eventStorage.c();
        int maxFilesToKeep = getMaxFilesToKeep();
        if (c2.size() <= maxFilesToKeep) {
            return;
        }
        int size = c2.size() - maxFilesToKeep;
        b.a.a.a.a.b.i.a(this.context, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", Integer.valueOf(c2.size()), Integer.valueOf(maxFilesToKeep), Integer.valueOf(size)));
        TreeSet treeSet = new TreeSet(new Comparator<a>() { // from class: b.a.a.a.a.d.b.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(a aVar, a aVar2) {
                return (int) (aVar.f1155b - aVar2.f1155b);
            }
        });
        for (File file : c2) {
            treeSet.add(new a(file, parseCreationTimestampFromFileName(file.getName())));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).f1154a);
            if (arrayList.size() == size) {
                break;
            }
        }
        this.eventStorage.a(arrayList);
    }

    public long parseCreationTimestampFromFileName(String str) {
        String[] split = str.split(ROLL_OVER_FILE_NAME_SEPARATOR);
        if (split.length != 3) {
            return 0L;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventsFilesManager.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final File f1154a;

        /* renamed from: b  reason: collision with root package name */
        final long f1155b;

        public a(File file, long j) {
            this.f1154a = file;
            this.f1155b = j;
        }
    }
}
