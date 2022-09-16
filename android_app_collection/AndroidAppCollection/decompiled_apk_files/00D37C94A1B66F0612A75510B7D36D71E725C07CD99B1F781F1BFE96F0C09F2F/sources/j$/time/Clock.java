package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes5.dex */
public abstract class Clock {
    public abstract Instant instant();

    public abstract long millis();

    public static Clock systemUTC() {
        return SystemClock.UTC;
    }

    protected Clock() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class SystemClock extends Clock implements Serializable {
        static final SystemClock UTC;
        private static final long serialVersionUID = 6740630888130243051L;
        private final ZoneId zone;

        static {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            UTC = new SystemClock(ZoneOffset.UTC);
        }

        SystemClock(ZoneId zoneId) {
            this.zone = zoneId;
        }

        @Override // j$.time.Clock
        public long millis() {
            return System.currentTimeMillis();
        }

        @Override // j$.time.Clock
        public Instant instant() {
            return Instant.ofEpochMilli(millis());
        }

        public boolean equals(Object obj) {
            if (obj instanceof SystemClock) {
                return this.zone.equals(((SystemClock) obj).zone);
            }
            return false;
        }

        public int hashCode() {
            return this.zone.hashCode() + 1;
        }

        public String toString() {
            String valueOf = String.valueOf(this.zone);
            StringBuilder sb = new StringBuilder(valueOf.length() + 13);
            sb.append("SystemClock[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
        }
    }
}
