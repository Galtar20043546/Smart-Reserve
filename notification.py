import sys
import time

def send_notification():
    if len(sys.argv) < 3:
        print("[ERROR] No data received from Java!")
        return

    guest_name = sys.argv[1]
    reservation_time = sys.argv[2]

    print("--------------------------------------------------")
    print(f"[PYTHON SERVICE] Notification request received...")

    time.sleep(1)

    print(f"[SMS] To: {guest_name}")
    print(f"[TEXT] Dear guest! Your table is reserved for {reservation_time}.")
    print("[SUCCESS] Notification sent successfully.")
    print("--------------------------------------------------")

if __name__ == "__main__":
    send_notification()